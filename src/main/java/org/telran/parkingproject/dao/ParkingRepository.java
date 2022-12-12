package org.telran.parkingproject.dao;

import org.telran.parkingproject.model.Car;

import java.util.List;

public interface ParkingRepository {

    List<Car> getAllParkedCars();

    void parkCar(int id);

    void removeCarFromParking(int id);
}
