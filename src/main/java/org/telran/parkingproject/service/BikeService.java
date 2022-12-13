package org.telran.parkingproject.service;

import org.telran.parkingproject.model.Bike;

import java.util.List;

public interface BikeService {

    List<Bike> list();

    Bike getBike(int id);

    Bike save(Bike bike);

    void remove (int id);
}
