package com.example.library.service;

import com.example.library.model.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class LibraryService {

    private static List<Library> libraries = new ArrayList<>();
    private static int count=1;
    static {
        libraries.add(new Library(count++, "GK library", "Delhi", 47568399, "New Books",  200));
        libraries.add(new Library(count++, "History Library", "Mumbai", 84763637, "Wifi Facility.", 150));
        libraries.add(new Library(count++, "Science Library", "Chandigarh", 948487274, "Great infrastructure", 100));
        libraries.add(new Library(count++, "CSE Library", "Goa", 59847626, "printing facility", 300));
        libraries.add(new Library(count++, "Kashmir Library", "Kashmir", 876356727, "Printing And Wifi facility", 550));
    }

    public List<Library> findAll(){
        return libraries;
    }

    public Library findByName(String name){
        Predicate<? super Library> predicate = library -> library.getLibraryName().equals(name);
        Library library = libraries.stream().filter(predicate).findFirst().get();
        return library;
    }

    public void addLibrary(Library library){
        libraries.add(library);
    }

    public void updateLibrary(String name, Library newLibrary){
        Library library = findByName(name);

        library.setId(newLibrary.getId());
        library.setLibraryName(newLibrary.getLibraryName());
        library.setLibraryAddress(newLibrary.getLibraryAddress());
        library.setLibraryNumber(newLibrary.getLibraryNumber());
        library.setLibraryFacilities(newLibrary.getLibraryFacilities());
        library.setSeatingCapacity(newLibrary.getSeatingCapacity());
    }

    public void deleteLibrary(String name){
        Predicate<? super Library> predicate = library -> library.getLibraryName().equals(name);
        libraries.removeIf(predicate);
    }
}
