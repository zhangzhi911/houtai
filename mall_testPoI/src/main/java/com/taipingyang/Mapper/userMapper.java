package com.taipingyang.Mapper;

import com.taipingyang.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface userMapper {

    public User login(User user);

    public int register(User user);

    public List<User> findAll(String userName);
}