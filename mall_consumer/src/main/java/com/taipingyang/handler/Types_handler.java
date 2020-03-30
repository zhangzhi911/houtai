package com.taipingyang.handler;

import com.taipingyang.api.Types_api;
import com.taipingyang.entity.conMytype;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Types_handler implements Types_api {
    @Override
    public String testtype() {
        return "报错了老弟";
    }

    @Override
    public List<conMytype> getTypeList() {
        System.out.println("报错了弟弟");

        return null;
    }

    @Override
    public boolean insertType(conMytype types) {
        System.out.println("报错了弟弟");

        return false;
    }

    @Override
    public boolean updateType(conMytype types) {
        System.out.println("报错了弟弟");

        return false;
    }

    @Override
    public boolean deleteType(Integer type_id) {
        System.out.println("报错了弟弟");

        return false;
    }
//    所有报错的方法在这里实现

}
