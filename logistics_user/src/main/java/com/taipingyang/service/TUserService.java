package com.taipingyang.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.TUser;
import com.taipingyang.mapper.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 普通用户 服务实现类
 * </p>
 *
 * @author Jsl
 * @since 2020-03-27
 */
@Service
public class TUserService {

    @Autowired
    private TUserMapper tUserMapper;


    public PageInfo<TUser> selectAll(TUser tUser) {
        PageHelper.startPage(tUser.getPageNo(), tUser.getPageSize());
        EntityWrapper<TUser> wrapper = new EntityWrapper<TUser>();
        System.out.println("用户名"+tUser.getUser_name());
        if (tUser.getUser_name()!=null){
            wrapper.like("user_name",tUser.getUser_name());
        }
        List<TUser> list = tUserMapper.selectList(wrapper);
        return new PageInfo<TUser>(list);
    }

    public void inture(Integer user_id) {
        tUserMapper.inture(user_id);
    }

    public void infalse(Integer user_id) {
        tUserMapper.infalse(user_id);
    }
}
