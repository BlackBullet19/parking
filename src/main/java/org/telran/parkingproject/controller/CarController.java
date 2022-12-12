package org.telran.parkingproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telran.parkingproject.model.Car;
import org.telran.parkingproject.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService service;

    @GetMapping
    public List<Car> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Car getCar(@PathVariable(name = "id")int id){
        return service.getCar(id);
    }

    @PostMapping()
    public Car create(@RequestBody Car car){
        return service.save(car);
    }

    @DeleteMapping("/{id}")
    public Boolean remove(@PathVariable(name = "id") int id){
        return service.remove(id);
    }
}
