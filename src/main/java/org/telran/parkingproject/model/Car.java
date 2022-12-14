package org.telran.parkingproject.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Column(name = "name")
    private String name;

    @Column(name = "year_of_construction")
    private int yearOfConstruction;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    @Column(name = "colour")
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
