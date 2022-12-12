package org.telran.parkingproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telran.parkingproject.model.Car;
import org.telran.parkingproject.service.ParkingService;

import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @Autowired
    private ParkingService parkingService;

    @GetMapping
    public List<Car> parkingList() {
        return parkingService.getAllParkedCars();
    }

    @PostMapping()
    public void parkCar (@RequestBody int id) {
        parkingService.parkCar(id);
    }

    @DeleteMapping("/{id}")
    public void removeCarFromParking(@PathVariable(name = "id") int id) {
        parkingService.removeCarFromParking(id);
    }
}
