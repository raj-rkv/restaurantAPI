package com.example.restaurant.model;

public class Restaurant {
    private String name;
    private String address;
    private String speciality;
    private int totalStaff;
    private boolean isOpen;
    private int rating;

    Restaurant(){

    }

    public Restaurant(String name, String address, String speciality, int totalStaff, boolean isOpen, int rating) {
        this.name = name;
        this.address = address;
        this.speciality = speciality;
        this.totalStaff = totalStaff;
        this.isOpen = isOpen;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
