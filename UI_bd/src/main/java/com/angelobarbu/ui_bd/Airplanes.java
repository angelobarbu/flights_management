/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angelobarbu.ui_bd;


public class Airplanes {
    
    private int airplaneID;
    private int companyID;
    private String manufacturer;
    private String model;
    private int year;
    private String type;
    private int capacity;

    public Airplanes(int airplaneID, int companyID, String manufacturer, String model, int year, String type, int capacity) {
        this.airplaneID = airplaneID;
        this.companyID = companyID;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.type = type;
        this.capacity = capacity;
    }

    public int getAirplaneID() {
        return airplaneID;
    }

    public int getCompanyID() {
        return companyID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
    
    
    
}
