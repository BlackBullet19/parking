package org.telran.parkingproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telran.parkingproject.dao.BikeJpaRepository;
import org.telran.parkingproject.model.Bike;

import java.util.List;

@Service
public class BikeServiceImpl implements BikeService {

    @Autowired
    BikeJpaRepository bikeRepository;

    @Override
    public List<Bike> list() {
        return bikeRepository.findAll();
    }

    @Override
    public Bike getBike(int id) {
        return bikeRepository.findById(id).orElse(null);
    }

    @Override
    public Bike save(Bike bike) {
        return bikeRepository.save(bike);
    }

    @Override
    public void remove(int id) {
        Bike byId = getBike(id);
        bikeRepository.delete(byId);
    }
}
