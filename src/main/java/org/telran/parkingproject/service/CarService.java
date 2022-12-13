package org.telran.parkingproject.service;

import org.telran.parkingproject.model.Car;

import java.util.List;

public interface CarService {

    List<Car> list();

    Car getCar(int id);

    Car save(Car car);

    Car update (Car car);

    void remove(int id);
}
