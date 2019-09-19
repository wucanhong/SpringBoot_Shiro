package com.example.shiro.Controller;

import com.example.shiro.model.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Author 吴灿洪
 * @Description 普通登录用户
 * @Date 2019/9/12 17:07
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ResultMap resultMap;

    @GetMapping("/getMessage")
    public ResultMap getMessage(){
        return resultMap.success().message("您拥有用户权限，可以获得该接口的信息");
    }
}
