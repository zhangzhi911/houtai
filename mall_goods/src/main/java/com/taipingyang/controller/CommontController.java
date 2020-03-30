package com.taipingyang.controller;

import com.taipingyang.Mapper.CommontMapper;
import com.taipingyang.entity.Commont;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommontController {

    @Autowired
    private CommontMapper commontMapper;

    @RequestMapping("/commont/list")
    public List<Commont> list() {
        return commontMapper.getList(null);
    }
}