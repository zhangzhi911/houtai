package com.taipingyang.Mapper;

import com.taipingyang.entity.Address;
import com.taipingyang.entity.Car;
import com.taipingyang.entity.Mytype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface carMapper {
    public List<Car> getCarList(Car car);

    public List<Address> getAddress(Integer id);


    public int insertCar(Car car);

//    查询单条数据
    public Car selectByCar(Car car);

    public int updateCar(Car car);

    public int deleteCar(Integer t_id);
}
