package com.dongruan.controller;


import com.dongruan.bean.Business;
import com.dongruan.bean.Msg;
import com.dongruan.dao.BusinessMapper;
import com.dongruan.service.BusinessServise;
import com.dongruan.util.BaseUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

/**
 * @author shkstart
 * @create 2020-09-16 14:35
 */
@RestController
@RequestMapping("business")
@Api(tags = "商家的Controller类")
public class BusinessController {
    @Autowired
    private BusinessServise businessServise;

    /**
     * id 获取商家信息
     * @param id
     * @return
     */
    @GetMapping("/getbyid/{id}")
    @ApiOperation("通过id查询商家")
    public Msg getBusiness(@ApiParam("商家id") @PathVariable("id")Integer id){
        Business business = businessServise.getBusinessById(id);
        return new Msg().success().add("business", business);
    }

    /**
     * 获取所有商家
     * @return
     */
    @GetMapping()
    @ApiOperation("查询全部商家")
    public Msg getAllBusiness(){
        List<Business> businesses = businessServise.showAllBusniess();
        return Msg.success().add("businesses", businesses);
    }

    /**
     * 添加商家
     * @param
     * @return
     * @throws IOException
     */
    @PostMapping()
    @ApiOperation("添加一个商家")
    public Msg addbusiness(Business business,MultipartFile multipartFile) throws IOException {
        //先把上传的文件保存到E盘这个目录下
        String fileName = System.currentTimeMillis()+ new Random().nextInt(9999)+".jpg";
        System.out.println(business);
        if(multipartFile==null){
            return Msg.fail();
        }else {
            multipartFile.transferTo(new File("E:\\图片资源\\"+fileName));
            File file = new File("E:\\图片资源\\"+fileName);
//        把文件转成base64编码的字符串
            String base64String = BaseUtils.getBase64String(file);
            business.setBusinessimg(base64String);
            businessServise.addBusiness(business);
            return Msg.success();
        }
    }

    /**
     * 通过分类获取商家
     * @param type
     * @return
     */
    @GetMapping("getbytype/{type}")
    @ApiOperation("通过分类获取商家")
    public Msg getBusinessByType(@PathVariable("type")String type){
        List<Business> businesses = businessServise.showBusinessbyBusinessExplain(type);
        return Msg.success().add("businesses", businesses);
    }


    @PostMapping("{id}")
    @ApiOperation("通过id更新一个商家")
    public Msg updateBusiness(@ApiParam("传入商家id")@PathVariable("id") Integer businessid, Business business,MultipartFile multipartFile) throws IOException {
        if (multipartFile!=null){
            //先把上传的文件保存到E盘这个目录下
            String fileName = System.currentTimeMillis()+ new Random().nextInt(9999)+".jpg";
            multipartFile.transferTo(new File("E:\\图片资源\\"+fileName));
            File file = new File("E:\\图片资源\\"+fileName);
            //把文件转成base64编码的字符串
            String base64String = BaseUtils.getBase64String(file);
            business.setBusinessimg(base64String);
        }else {
            Business businessById = businessServise.getBusinessById(businessid);
            String businessimg = businessById.getBusinessimg();
            business.setBusinessimg(businessimg);
        }
        business.setBusinessid(businessid);
        businessServise.updataBusiness(business);
        return Msg.success();

    }
    @DeleteMapping("{id}")
    @ApiOperation("通过id删除一个商家")
    public Msg deleteBusiness(@PathVariable("id") Integer businessid){
        businessServise.deleteBusiness(businessid);
        return Msg.success();
    }
}
