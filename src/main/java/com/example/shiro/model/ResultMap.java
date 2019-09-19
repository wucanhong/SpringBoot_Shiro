package com.example.shiro.model;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @ClassName ResultMap
 * @Author 吴灿洪
 * @Description
 * @Date 2019/9/12 16:56
 * @Version 1.0
 */
@Component
public class ResultMap extends HashMap<String, Object> {
    public ResultMap(){

    }

    public ResultMap success(){
        this.put("result", "success");
        return this;
    }

    public ResultMap fail(){
        this.put("result", "fail");
        return this;
    }

    public ResultMap message(Object message){
        this.put("message", message);
        return this;
    }
}
