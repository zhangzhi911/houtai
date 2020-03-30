package com.taipingyang.Mapper;

import com.taipingyang.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface userMapper {

    public User login(User user);

    public int register(User user);

    public List<User> findAll(String userName);


    void upFlag(User user);

    void Flag(Integer userId);

    void inFlag(Integer userId);

    User show(Integer userId);

    int insert(User user);

    int update(User user);







}