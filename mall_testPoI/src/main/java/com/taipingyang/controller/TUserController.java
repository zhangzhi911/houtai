package com.taipingyang.controller;

import com.taipingyang.entity.UserVo;
import com.taipingyang.service.ITUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.HttpHeaders;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;


@Slf4j
@RestController
@CrossOrigin
public class TUserController {

    @Autowired
    private ITUserService itUserService;

    @RequestMapping("/downLoadGoodsExcel")
    public ResponseEntity downLoadGoodsExcel(UserVo userVo) throws Exception {

        XSSFWorkbook xSSFWorkbooks = itUserService.downLoadGoodsExcel(userVo);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        xSSFWorkbooks.write(byteArrayOutputStream);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentDispositionFormData("attachment", new String("用户表.xlsx".getBytes("UTF-8"), "ISO-8859-1"));
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity(byteArrayOutputStream.toByteArray(), httpHeaders, HttpStatus.CREATED);

    }

    List<String> excelname = Arrays.asList(".xls", ".xlsx");


    @RequestMapping("/upLoadExcel2")
    public String upLoadExcel2(@RequestParam(required = false, name = "photoo") MultipartFile photo) throws Exception {
        if (photo == null){
            throw new Exception("文件为空");
        }
        String fileType = photo.getOriginalFilename().substring(photo.getOriginalFilename().lastIndexOf("."));
        System.out.println(fileType);
        if (!excelname.contains(fileType)) {
            throw new Exception("只能导入excel格式的文件");
        }
        try {
            this.itUserService.uplodExcel(photo);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            throw new Exception("导入数据失败");
        }
//        return ResultEntity.ok("导入数据成功");
        return "导入数据成功";
    }





    @RequestMapping("/upLoadExcel")
    public String upLoadExcel(MultipartFile file) throws Exception {
        if (file == null){
            throw new Exception("文件为空");
        }
        String fileType = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        System.out.println(fileType);
        if (!excelname.contains(fileType)) {
            throw new Exception("只能导入excel格式的文件");
        }
        try {
            this.itUserService.uplodExcel(file);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            throw new Exception("导入数据失败");
        }
//        return ResultEntity.ok("导入数据成功");
        return "导入数据成功";
    }

}