package com.taipingyang.api;


import com.taipingyang.entity.conMytype;
import com.taipingyang.handler.Types_handler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//这里远程调用 实现业务的模块
// 报错的话走这里car_handler
@FeignClient(value = "mallgoods", fallback = Types_handler.class)
public interface Types_api {
    @RequestMapping("/type/test")
    public String testtype();

    @RequestMapping("/type/getTypList")
    public List<conMytype> getTypeList();

    @RequestMapping("/type/insertType")
    public boolean insertType(conMytype types);

    @RequestMapping("/type/updateType")
    public boolean updateType(conMytype types);

    @RequestMapping("/type/deleteType")
    public boolean deleteType(Integer type_id);


}
