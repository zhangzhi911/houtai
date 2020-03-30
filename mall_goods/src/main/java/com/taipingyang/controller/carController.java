package com.taipingyang.controller;

import com.taipingyang.entity.Address;
import com.taipingyang.entity.Car;
import com.taipingyang.service.carService;
import com.taipingyang.service.goodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class carController {

    @Autowired
    private carService service;

    @RequestMapping("/car/test")
    public String testcar() {
        return "购物车测试=====>来了弟弟?";
    }

    @RequestMapping("/address/findlist")
    public List<Address> getAddress(@RequestBody Integer id) {
        return service.getAddress(id);
    }

    @RequestMapping("/car/getCarList")
    public List<Car> getCarList(@RequestBody Car car) {
        return service.getCarList(car);
    }

    @RequestMapping("/car/insertCar")
    public boolean insertCar(@RequestBody Car car) {

        Car car1 = service.selectByCar(car);
        System.out.println("查询购物车==>" + car1);
        if (car1 != null) {
            car1.setT_gid(car.getT_gid());
            car1.setT_uid(car.getT_uid());
            car1.setT_sum(car.getT_sum() + car1.getT_sum());
            car1.setT_count(car.getT_count() + car1.getT_count());
            service.updateCar(car1);
        } else {
            service.insertCar(car);
        }
        return true;
    }

    @RequestMapping("/car/updateCar")
    public boolean updateCar(@RequestBody Car car) {
        return service.updateCar(car) > 0;
    }

    @RequestMapping("/car/deleteCar")
    public boolean deleteCar(@RequestBody Integer t_id) {
        return service.deleteCar(t_id) > 0;
    }
}