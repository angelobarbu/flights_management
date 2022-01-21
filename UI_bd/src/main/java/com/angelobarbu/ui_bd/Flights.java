/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angelobarbu.ui_bd;

import java.sql.Date;
import java.sql.Time;

public class Flights {
    
    private int flightID;
    private int companyID;
    private int airportID;
    private int airplaneID;
    private String flightNo;
    private String type;
    private Date date;
    private Time depTime;
    private Time arrTime;
    private String destination;

    public Flights(int flightID, int companyID, int airportID, int airplaneID, String flightNo, String type, Date date, Time depTime, Time arrTime) {
        this.flightID = flightID;
        this.companyID = companyID;
        this.airportID = airportID;
        this.airplaneID = airplaneID;
        this.flightNo = flightNo;
        this.type = type;
        this.date = date;
        this.depTime = depTime;
        this.arrTime = arrTime;
    }
    
    public Flights(String flightNo, String type, String destination, Date date, Time depTime, Time arrTime) {
        this.flightNo = flightNo;
        this.type = type;
        this.destination = destination;
        this.date = date;
        this.depTime = depTime;
        this.arrTime = arrTime;
    }

    public int getFlightID() {
        return flightID;
    }

    public int getCompanyID() {
        return companyID;
    }

    public int getAirportID() {
        return airportID;
    }
    
    public int getAirplaneID() {
        return airplaneID;
    }
    
    public String getFlightNo() {
        return flightNo;
    }

    public String getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }

    public Time getDepTime() {
        return depTime;
    }

    public Time getArrTime() {
        return arrTime;
    }
    
    public String getDestination() {
        return destination;
    }
    
}
