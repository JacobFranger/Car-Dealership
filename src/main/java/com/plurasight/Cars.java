package com.plurasight;

import java.lang.reflect.Array;

public class Cars {
    // attributes
    private String make, model, color, vehicleType;
    private int year, vin, odometer;
    private double price;

    //overloaded constructor, no parameters
    public Car() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.odometer = odometer;
        this.year = year;
        this.price = price;
        this.vehicleType = "";
        this.vin = vin;
    }



    //overloaded constructor, 1 parameter
    public Car(String make) {
        this.make = make;
        this.model = "";
        this.color = "";
        this.vin = vin;
        this.year = year;
        this.price = price;
        this.vehicleType = "";
        this.odometer = odometer;
    }



    // constructor
    public vehicle(String make, String model, String color, int year, int milage, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.vin = vin;
        this.price = price;
    }





    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }




}
