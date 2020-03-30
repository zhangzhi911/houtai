package com.taipingyang.api;

import com.taipingyang.entity.conAddress;
import com.taipingyang.entity.conCar;
import com.taipingyang.handler.Car_handler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


//这里远程调用 实现业务的模块
// 报错的话走这里car_handler
@FeignClient(value = "mallgoods", fallback = Car_handler.class)
public interface Car_api {
    @RequestMapping("/car/test")
    public String testcar();

    @RequestMapping("/address/findlist")
    public List<conAddress> getAddress(Integer id);

    @RequestMapping("/car/getCarList")
    public List<conCar> getCarList(conCar car);

    @RequestMapping("/car/insertCar")
    public boolean insertCar(conCar car);

    @RequestMapping("/car/updateCar")
    public boolean updateCar(conCar car);

    @RequestMapping("/car/deleteCar")
    public boolean deleteCar(Integer t_id);

}