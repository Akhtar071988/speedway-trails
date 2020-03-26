package com.galvanize.service;

import com.galvanize.entities.Driver;
import com.galvanize.repository.CarRepository;
import com.galvanize.repository.DriverRepository;
import com.galvanize.repository.RaceRepository;
import javafx.beans.value.ObservableBooleanValue;

import java.util.List;

public class SpeedwayService {
    RaceRepository raceRepository;
    CarRepository carRepository;
    DriverRepository driverRepository;

    public SpeedwayService(DriverRepository driverRepository, CarRepository carRepository, RaceRepository raceRepository) {
        this.driverRepository = driverRepository;
        this.carRepository = carRepository;
        this.raceRepository = raceRepository;
    }

    public Driver createDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    public Driver findDriverById(long l) {
        return driverRepository.findById(l).get();
    }

    public List<Driver> findAllDrivers() {
        return driverRepository.findAll();
    }
}
