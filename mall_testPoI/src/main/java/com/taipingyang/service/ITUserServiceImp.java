package com.taipingyang.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taipingyang.Mapper.TUserMapper;
import com.taipingyang.entity.UserVo;
import com.taipingyang.utils.ExcelBean;
import com.taipingyang.utils.ExcelUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ITUserServiceImp  extends ServiceImpl<TUserMapper, UserVo> implements  ITUserService {


    @Override
    public XSSFWorkbook downLoadGoodsExcel(UserVo userVo) throws Exception {

        PageHelper.startPage(userVo.getNum(),userVo.getSize());
        Wrapper wrapper = new EntityWrapper();

        if (StringUtils.isNotBlank(userVo.getUser_name())){
            wrapper.like("name",userVo.getUser_name());
        }
        List<UserVo> list = this.selectList(wrapper);
        System.out.println("查询回来了buddy"+list);
//        List<UserVo> list = new ArrayList<>();
        UserVo userVo1 = new UserVo();
        userVo1.setSex("男");
        userVo1.setUserId(1);
        userVo1.setUser_name("来了老弟");
//        list.add(userVo1);
//        list.add(userVo1);
        PageInfo<UserVo> pageInfo = new PageInfo(list);

        Map<Integer,List<ExcelBean>> map = new HashMap<Integer,List<ExcelBean>>();
        List<ExcelBean> excelBeans = new ArrayList<>();

        excelBeans.add(new ExcelBean("userId","userId",0));
        excelBeans.add(new ExcelBean("姓名","user_name",0));
        excelBeans.add(new ExcelBean("性别","sex",0));
        excelBeans.add(new ExcelBean("密码","user_password",0));
        excelBeans.add(new ExcelBean("年龄","age",0));
        excelBeans.add(new ExcelBean("用户权限","permiss",0));
        excelBeans.add(new ExcelBean("用户余额","money",0));
        excelBeans.add(new ExcelBean("图片","photo",0));
        excelBeans.add(new ExcelBean("状态","userFlag",0));
        excelBeans.add(new ExcelBean("地址","address",0));
        map.put(0,excelBeans);

        return ExcelUtils.createExcelFile(UserVo.class,pageInfo.getList(),map,"用户列表");
    }



    @Override
    public void uplodExcel(MultipartFile multipartFile) throws Exception {
        List<List<Object>> bankListByExcel = ExcelUtils.getBankListByExcel(multipartFile.getInputStream(), multipartFile.getOriginalFilename());
        List<UserVo> list = new ArrayList<>();

        for (List<Object> objects : bankListByExcel) {
            UserVo userVo = new UserVo();
             userVo.setUser_name(objects.get(1).toString());
             userVo.setSex("男");
//            goods.setName(objects.get(1).toString());
//            goods.setCode(objects.get(2).toString());
//            goods.setInventoryQuantity(Integer.valueOf(objects.get(3).toString()));
//            goods.setModel(objects.get(4).toString());
//            goods.setProducer(objects.get(5).toString());
//            goods.setPurchasingPrice(Float.valueOf(objects.get(6).toString()));
//            goods.setSellingPrice(Float.valueOf(objects.get(7).toString()));
//            goods.setLastPurchasingPrice(Float.valueOf(objects.get(8).toString()));
//            goods.setUnit(objects.get(9).toString());
//            goods.setState(objects.get(10).toString().equals("上架")?2:0);
//            goods.setMinNum(100);
            list.add(userVo);
        }
        this.insertBatch(list);
    }
}
