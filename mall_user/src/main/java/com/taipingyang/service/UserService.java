package com.taipingyang.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.User;
import com.taipingyang.entity.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

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
    public int testuser(User user) {

        return 1;
    }

    public int register(User user) {
        return userMapper.register(user);
    }


    public PageInfo<User> findAll(UserVo userVo) {
        PageHelper.startPage(userVo.getNum(), userVo.getSize());
        List<User> all = userMapper.findAll(userVo.getUser_name());
        all.forEach(item->{
            if (item.getUserFlag()<=2){
                item.setStatus(1);
            }else {
                item.setStatus(2);
            }
        });
        return new PageInfo<User>(all);
    }

    public void Flag(Integer userId) {
        userMapper.Flag(userId);
    }

    public void inFlag(Integer userId) {
        userMapper.inFlag(userId);
    }

    public User show(Integer userId) {
        return userMapper.show(userId);
    }

    public int save(User user) {
        return userMapper.update(user);
       /* if(user.getUserId()!=null){
        }else {
            userMapper.insert(user);
        }
*/
    }







}
