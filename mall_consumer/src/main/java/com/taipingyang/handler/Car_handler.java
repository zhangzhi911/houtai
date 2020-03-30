package com.taipingyang.handler;

import com.taipingyang.api.Car_api;
import com.taipingyang.entity.conAddress;
import com.taipingyang.entity.conCar;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Car_handler implements Car_api {


    @Override
    public String testcar() {
        return "报错了老弟";
    }

    @Override
    public List<conAddress> getAddress(Integer id) {

        System.out.println("报错的弟弟");
        return null;
    }

    @Override
    public List<conCar> getCarList(conCar car) {
        System.out.println("报错的弟弟");
        return null;
    }



    @Override
    public boolean insertCar(conCar car) {
        System.out.println("报错的弟弟");

        return false;
    }

    @Override
    public boolean updateCar(conCar car) {
        System.out.println("报错的弟弟");

        return false;
    }

    @Override
    public boolean deleteCar(Integer t_id) {
        System.out.println("报错的弟弟");

        return false;
    }
//    所有报错的方法在这里实现

}
