package com.dongruan.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-06-01 16:09
 */
public class Msg {

    //状态码100-成功 200-失败
    private Integer code;
    //携带的信息
    private String msg;
    //
    private Map<String,Object> extend = new HashMap<>();


    public static Msg success(){
        Msg msg = new Msg();
        msg.setCode(100);
        msg.setMsg("请求成功");
        return msg;
    }

    public static Msg fail(){
        Msg msg = new Msg();
        msg.setCode(200);
        msg.setMsg("请求失败");
        return msg;
    }

    public Msg add(String Key, Object value){
        this.getExtend().put(Key, value);
        return this;
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}
