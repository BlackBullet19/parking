package org.telran.parkingproject.service;

import org.telran.parkingproject.model.Car;

import java.util.List;

public interface ParkingService {

    List<Car> getAllParkedCars();

    void parkCar(int id);

    void removeCarFromParking(int id);
}
