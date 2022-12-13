package org.telran.parkingproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.telran.parkingproject.model.Car;

public interface CarJpaRepository extends JpaRepository<Car,Integer> {
}
