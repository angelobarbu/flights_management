/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angelobarbu.ui_bd;

import java.sql.Date;

/**
 *
 * @author Angelo
 */
public class Passengers {
    
    private int passengerID;
    private String lastName;
    private String firstName;
    private String passportNo;
    private String address;
    private String city;
    private String country;
    private Date dateOfBirth;

    public Passengers(int passengerID, String lastName, String firstName, String passportNo, String address, String city, String country, Date dateOfBirth) {
        this.passengerID = passengerID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.passportNo = passportNo;
        this.address = address;
        this.city = city;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
    
    
}
