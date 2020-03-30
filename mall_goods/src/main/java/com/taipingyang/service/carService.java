package com.taipingyang.service;

import com.taipingyang.Mapper.goodMapper;
import com.taipingyang.entity.Address;
import com.taipingyang.entity.Car;
import com.taipingyang.entity.Mytype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class carService {

    @Autowired
    private com.taipingyang.Mapper.carMapper carMapper;

    public List<Address> getAddress(Integer id){return  carMapper.getAddress(id);}

    public List<Car> getCarList(Car car) {
        return carMapper.getCarList(car);
    }

    public int insertCar(Car car) {
        return carMapper.insertCar(car);
    }

    public int updateCar(Car car) {
        return carMapper.updateCar(car);
    }

    public int deleteCar(Integer t_id) {
        return carMapper.deleteCar(t_id);
    }

    public Car selectByCar(Car car) {
        return carMapper.selectByCar(car);
    }

}
