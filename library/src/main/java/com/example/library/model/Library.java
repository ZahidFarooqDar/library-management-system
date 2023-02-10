package com.example.library.model;

public class Library {
    private int id;
    private String libraryName;
    private String libraryAddress;
    private long libraryNumber;
    private String libraryFacilities;
    private int seatingCapacity;

    public Library() {
    }

    public Library(int id, String libraryName, String libraryAddress, long libraryNumber, String libraryFacilities, int seatingCapacity) {
        this.id = id;
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
        this.libraryNumber = libraryNumber;
        this.libraryFacilities = libraryFacilities;
        this.seatingCapacity = seatingCapacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryAddress() {
        return libraryAddress;
    }

    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress;
    }

    public long getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(long libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public String getLibraryFacilities() {
        return libraryFacilities;
    }

    public void setLibraryFacilities(String libraryFacilities) {
        this.libraryFacilities = libraryFacilities;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", libraryName='" + libraryName + '\'' +
                ", libraryAddress='" + libraryAddress + '\'' +
                ", libraryNumber=" + libraryNumber +
                ", libraryFacilities='" + libraryFacilities + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                '}';
    }
}