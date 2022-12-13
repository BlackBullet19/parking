package org.telran.parkingproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telran.parkingproject.dao.CarJpaRepository;
import org.telran.parkingproject.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarJpaRepository carRepository;


    @Override
    public List<Car> list() {
        return carRepository.findAll();
        // return carRepository.list();
    }

    @Override
    public Car getCar(int id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public Car save(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car update(Car car) {

        return null;
    }

    @Override
    public void remove(int id) {
        Car byId = getCar(id);
        carRepository.delete(byId);
    }
}
