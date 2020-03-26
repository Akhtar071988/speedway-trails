package com.galvanize.service;

import com.galvanize.entities.Driver;
import com.galvanize.repository.CarRepository;
import com.galvanize.repository.DriverRepository;
import com.galvanize.repository.RaceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class SpeedwayServiceTest {

    @Autowired
    DriverRepository driverRepository;

    @Autowired
    CarRepository carRepository;

    @Autowired
    RaceRepository raceRepository;

    @Test
    void createDriver() {
        SpeedwayService speedwayService = new SpeedwayService(driverRepository, carRepository, raceRepository);
        Driver driver = new Driver("Jimmy", "Blart", "Mall Cop", 55);
        Driver actual = (Driver) speedwayService.createDriver(driver);
        driver.setWin(0);
        driver.setLoss(0);

        assertEquals(driver, actual);
    }

    @Test
    void findDriverById() {
        SpeedwayService speedwayService = new SpeedwayService(driverRepository, carRepository, raceRepository);
        Driver expected = (Driver) speedwayService.createDriver(new Driver("Paul", "Bethany", "Vision", 55));
        assertEquals(expected, speedwayService.findDriverById(expected.getId()));
    }

    @Test
    void findAllDrivers() {
        SpeedwayService speedwayService = new SpeedwayService(driverRepository, carRepository, raceRepository);
        Driver expected = speedwayService.createDriver(new Driver("Paul", "Bethany", "Vision", 55));
        List<Driver> drivers = new ArrayList<>();
        drivers.add(expected);
        assertEquals(drivers, speedwayService.findAllDrivers());
    }
}
