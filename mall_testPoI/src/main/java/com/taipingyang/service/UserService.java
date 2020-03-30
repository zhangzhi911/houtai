package com.taipingyang.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.User;
import com.taipingyang.entity.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private com.taipingyang.Mapper.userMapper userMapper;

    public User login(User user) {
        User login = userMapper.login(user);
        return login;
    }

    public int register(User user) {
        userMapper.register(user);
        return userMapper.register(user);
    }


    public PageInfo<User> findAll(UserVo userVo) {
        PageHelper.startPage(1, 5);
        List<User> all = userMapper.findAll("zhangsan");

        return new PageInfo<User>(all);
    }
}
