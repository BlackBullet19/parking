package org.telran.parkingproject.model;

public class Car {

    private String name;

    private int yearOfConstruction;

    private int id;

    private String colour;

    public Car() {
        //
    }

    public Car(String name, int yearOfConstruction, int id, String colour) {
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
        this.id = id;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
