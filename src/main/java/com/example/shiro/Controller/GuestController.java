package com.example.shiro.Controller;

import com.example.shiro.model.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GuestController
 * @Author 吴灿洪
 * @Description 游客登录
 * @Date 2019/9/12 16:51
 * @Version 1.0
 */
@RestController
@RequestMapping("/guest")
public class GuestController {


    private final ResultMap resultMap;

    @Autowired
    public GuestController(ResultMap resultMap) {
        this.resultMap = resultMap;
    }

    @GetMapping("/enter")
    public ResultMap login(){
        return resultMap.success().message("欢迎进入，您的身份是游客");
    }

    @GetMapping("/getMessage")
    public ResultMap submitLogin(){
        return resultMap.success().message("您拥有获得该接口的信息的权限");
    }

}
