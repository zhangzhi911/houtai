package com.taipingyang.controller;

import com.taipingyang.api.Car_api;
import com.taipingyang.entity.conAddress;
import com.taipingyang.entity.conCar;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class CarController {

    @Autowired
    private Car_api car_api;

    @RequestMapping("/car/test")
    public List<conCar> testcar() {
        ArrayList<conCar> conCars = new ArrayList<>();
        conCar conCar = new conCar();
        conCar.setT_count(1);
        conCars.add(conCar);
        return conCars;
    }

    @RequestMapping("/address/findlist")
    public List<conAddress> getAddress(Integer id) {
        return car_api.getAddress(id);
    }


    @RequestMapping("/car/getCarList")
    public List<conCar> getCarList(conCar car) {
        return car_api.getCarList(car);
    }

    @RequestMapping("/car/insertCar")
    public boolean insertCar(conCar car) {
        return car_api.insertCar(car);
    }

    @RequestMapping("/car/updateCar")
    public boolean updateCar(conCar car) {
        return car_api.updateCar(car);
    }

    @RequestMapping("/car/deleteCar")
    public boolean deleteCar(Integer t_id) {
        return car_api.deleteCar(t_id);
    }
}