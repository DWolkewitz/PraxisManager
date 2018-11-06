package com.example.darius.praxismanager.logic.objects;

public class Patient {

    private final int id;
    private final String name;
    private final String surname;
    private final char gender;
    private final int phone;
    private final String streetName;
    private final String streetNumber;
    private final int zipcode;
    private final String city;


    public Patient(int id, String name, String surname, char gender, int phone, String streetName, String streetNumber, int zipcode, String city) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.phone = phone;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.zipcode = zipcode;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public char getGender() {
        return gender;
    }

    public int getPhone() {
        return phone;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }

}
