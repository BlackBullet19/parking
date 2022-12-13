package org.telran.parkingproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telran.parkingproject.model.Bike;
import org.telran.parkingproject.service.BikeService;

import java.util.List;

@RestController
@RequestMapping("/bikes")
public class BikeController {

    @Autowired
    private BikeService bikeService;

    @GetMapping
    public List<Bike> list() {
        return bikeService.list();
    }

    @GetMapping("/{id}")
    public Bike getBike(@PathVariable(name = "id") int id) {
        return bikeService.getBike(id);
    }

    @PostMapping()
    public Bike create(@RequestBody Bike bike) {
        return bikeService.save(bike);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable(name = "id") int id){
         bikeService.remove(id);
    }
}
