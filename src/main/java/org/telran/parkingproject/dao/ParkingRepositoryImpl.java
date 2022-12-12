package org.telran.parkingproject.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telran.parkingproject.model.Car;
import org.telran.parkingproject.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Component
public class ParkingRepositoryImpl implements ParkingRepository {

    private List<Car> parkedCars = new ArrayList<>(10);

    @Autowired
    private CarService carService;

    @Override
    public List<Car> getAllParkedCars() {
        return parkedCars;
    }

    @Override
    public void parkCar(int id) {
        parkedCars.add(carService.getCar(id));
    }

    @Override
    public void removeCarFromParking(int id) {
        parkedCars.remove(carService.getCar(id));
    }
}
