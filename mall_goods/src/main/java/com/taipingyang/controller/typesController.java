package com.taipingyang.controller;

import com.taipingyang.entity.Mytype;
import com.taipingyang.service.typesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class typesController {

    @Autowired
    private typesService service;


    @RequestMapping("/type/test")
    public String testtype() {
        return "type测试来了";
    }

    @RequestMapping("/type/getTypList")
    public List<Mytype> getTypeList() {
        return service.typelist();
    }

    @RequestMapping("/type/insertType")
    public boolean insertType(@RequestBody Mytype types) {
        return service.insertType(types) > 0;
    }

    @RequestMapping("/type/updateType")
    public boolean updateType(@RequestBody Mytype types) {
        return service.updateType(types) > 0;
    }

    @RequestMapping("/type/deleteType")
    public boolean deleteType(@RequestBody Integer type_id) {
        return service.deleteType(type_id) > 0;
    }
}