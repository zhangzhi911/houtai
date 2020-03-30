package com.taipingyang.controller;

import com.taipingyang.api.Types_api;
import com.taipingyang.entity.conMytype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypeController {


    @Autowired
    private Types_api types_api;

    @RequestMapping("/type/test")
    public String testtype() {
        return types_api.testtype();
    }

    @RequestMapping("/type/getTypList")
    public List<conMytype> getTypeList() {
        return types_api.getTypeList();
    }

    @RequestMapping("/type/insertType")
    public boolean insertType(conMytype types) {
        return types_api.insertType(types);
    }

    @RequestMapping("/type/updateType")
    public boolean updateType(conMytype types) {
        return types_api.updateType(types);
    }

    @RequestMapping("/type/deleteType")
    public boolean deleteType(Integer type_id) {
        return types_api.deleteType(type_id);
    }


}