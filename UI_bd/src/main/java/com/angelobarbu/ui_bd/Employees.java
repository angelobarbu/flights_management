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
public class Employees {
    
    private int employeeID;
    private int companyID;
    private String lastName;
    private String firstName;
    private String nationalID;
    private String address;
    private String city;
    private String country;
    private Date dateOfBirth;
    private String position;
    private int salary;

    public Employees(int employeeID, int companyID, String lastName, String firstName, String nationalID, String address, String city, String country, Date dateOfBirth, String position, int salary) {
        this.employeeID = employeeID;
        this.companyID = companyID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.nationalID = nationalID;
        this.address = address;
        this.city = city;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
        this.salary = salary;
    }

    public Employees(String lastName, String firstName, String position, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.salary = salary;
    }
    
    public int getEmployeeID() {
        return employeeID;
    }

    public int getCompanyID() {
        return companyID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getNationalID() {
        return nationalID;
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

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }
    
    
    
}
