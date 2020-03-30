package com.taipingyang.service;

import com.taipingyang.entity.UserVo;
import org.springframework.web.multipart.MultipartFile;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public interface ITUserService {

    XSSFWorkbook downLoadGoodsExcel(UserVo userVo) throws Exception;

    void uplodExcel(MultipartFile multipartFile) throws Exception;

}
