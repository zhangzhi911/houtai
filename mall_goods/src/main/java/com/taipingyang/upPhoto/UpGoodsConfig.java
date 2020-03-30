package com.taipingyang.upPhoto;


import com.taipingyang.config.FileInfoo;
import com.taipingyang.entity.Goods;
import com.taipingyang.service.goodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@CrossOrigin
public class UpGoodsConfig {

    @Value("${upload.rootDir}")
    private String uploadRootDir;


    @Autowired
    private goodService Service;


    @RequestMapping("/goods/uploadPhoto")
    public Map<String, Object> uploadPhoto(@RequestParam(required = false, name = "file") MultipartFile file) throws IOException {
        FileInfoo fileInfoo = upload(file);

        Map<String, Object> result = new HashMap<>();
        result.put("error", false);
        result.put("file", fileInfoo);
        return result;
    }

    @RequestMapping("/goods/update")
    public Map<String, Object> update(Goods goods, @RequestParam(required = false, name = "photoo") MultipartFile photo) throws IOException {
        FileInfoo fileInfoo = upload(photo);
        goods.setT_image(fileInfoo.getPath());

        Service.updateGoods(goods);

        return Collections.singletonMap("error", false);
    }

    @RequestMapping("/goods/save")
    public Map<String, Object> save(Goods goods, @RequestParam(required = false, name = "photoo") MultipartFile photo) throws IOException {
        FileInfoo fileInfoo = upload(photo);
        goods.setT_image(fileInfoo.getPath());

        Service.addGoods(goods);

        return Collections.singletonMap("error", false);
    }


    private FileInfoo upload(MultipartFile photo) throws IOException {

        String originalFilename = photo.getOriginalFilename(); // te.st.gif 获取文件名
        System.out.println("名字1==》" + originalFilename);
        String extension = getExtension(originalFilename); //去掉后缀名
        System.out.println("名字2==》" + extension);
        String fileName = UUID.randomUUID().toString() + extension; // UUID.gif
        String filePath = "/photo/" + new SimpleDateFormat("yyyyMMdd").format(new Date()) + "/" + fileName;
        long size = photo.getSize();

        FileInfoo fileInfoo = new FileInfoo();
        fileInfoo.setName(fileName);
        fileInfoo.setOriginalName(originalFilename);
        fileInfoo.setSize(size);
        fileInfoo.setPath(filePath);

//        uploadRootDir是磁盘路径
        String absolutePath = uploadRootDir + filePath;

        File file = new File(absolutePath);
        file.getParentFile().mkdirs(); //创建文件夹


        photo.transferTo(file);  //保存文件
        System.out.println("存储的路径是" + fileInfoo);
        return fileInfoo;
    }

    //    这个方法是去掉后缀名
    private String getExtension(String originalFilename) {
        String extension = "";
        int index = originalFilename.lastIndexOf('.');
        if (index != -1) {
            extension = originalFilename.substring(index); // .gif
        }
        return extension;
    }


    @RequestMapping(value = "/showImg")
    @ResponseBody
    public void showImg(HttpServletRequest request, HttpServletResponse response, String pathName) {
        File imgFile = new File(uploadRootDir + pathName);
        FileInputStream fin = null;
        OutputStream output = null;
        try {
            output = response.getOutputStream();
            fin = new FileInputStream(imgFile);
            byte[] arr = new byte[1024 * 10];
            int n;
            while ((n = fin.read(arr)) != -1) {
                output.write(arr, 0, n);
            }
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
