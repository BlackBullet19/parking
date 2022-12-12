package org.telran.parkingproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telran.parkingproject.dao.ParkingRepository;
import org.telran.parkingproject.model.Car;

import java.util.List;

@Service
public class ParkingServiceImpl implements ParkingService {

    @Autowired
    private ParkingRepository parkingRepository;

    @Override
    public List<Car> getAllParkedCars() {
        return parkingRepository.getAllParkedCars();
    }

    @Override
    public void parkCar(int id) {
        parkingRepository.parkCar(id);
    }

    @Override
    public void removeCarFromParking(int id) {
        parkingRepository.removeCarFromParking(id);
    }
}
