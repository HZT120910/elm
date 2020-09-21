package com.dongruan.controller;


import com.dongruan.bean.Business;
import com.dongruan.bean.Msg;
import com.dongruan.dao.BusinessMapper;
import com.dongruan.util.BaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-16 14:35
 */
@RestController
@RequestMapping("business")
public class BusinessController {
    @Autowired
    private BusinessMapper businessMapper;

    @GetMapping("get/{id}")
    public Business getBusiness(@PathVariable("id")Integer id){
        Business business = businessMapper.selectByPrimaryKey(id);
        System.out.println(business);
        return business;
    }

    @GetMapping("get")
    public Msg getAllBusiness(){
        List<Business> businesses = businessMapper.selectByExampleWithBLOBs(null);
        System.out.println(businesses);
        return new Msg().add("businesses", businesses).success();
    }

    @PostMapping("picture")
    public String PicTest(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        System.out.println(multipartFile.getOriginalFilename());
        multipartFile.transferTo(new File("E:\\图片资源\\600.jpg"));
        File file = new File("E:\\图片资源\\600.jpg");
        System.out.println(BaseUtils.getBase64String(file));
        return new String();

    }





    @GetMapping("/test")
    public String ttt(){
        return "ok";
    }
}
