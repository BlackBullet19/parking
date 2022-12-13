package org.telran.parkingproject.model;

import javax.persistence.*;

@Entity
@Table(name = "bike")
public class Bike {

        @Column(name = "name")
        private String name;

        @Column(name = "year_of_construction")
        private int yearOfConstruction;

        @GeneratedValue(strategy = GenerationType.AUTO)
        @Id
        private int id;

    public Bike(String name, int yearOfConstruction, int id) {
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
        this.id = id;
    }

    public Bike() {
        //
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
}
