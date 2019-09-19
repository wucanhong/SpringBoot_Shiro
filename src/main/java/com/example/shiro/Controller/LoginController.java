package com.example.shiro.Controller;

import com.example.shiro.mapper.UserMapper;
import com.example.shiro.model.ResultMap;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LoginController
 * @Author 吴灿洪
 * @Description
 * @Date 2019/9/12 17:17
 * @Version 1.0
 */
@RestController
public class LoginController {

    @Autowired
    private ResultMap resultMap;
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/notLogin")
    public ResultMap notLogin(){
        return resultMap.success().message("您没有登录！");
    }

    @GetMapping("/notRole")
    public ResultMap notRole(){
        return resultMap.success().message("您没有权限!");
    }

    @GetMapping("/logout")
    public ResultMap logout(){
        Subject subject = SecurityUtils.getSubject();
        //注销
        subject.logout();
        return resultMap.success().message("成功注销");
    }


    @PostMapping("/login")
    public ResultMap login(String username, String password){
        //从SecurityUtils里面创建一个subject
        Subject subject = SecurityUtils.getSubject();
        //在认证提交前准备 token (令牌)
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        //执行认证登录
        subject.login(token);
        //根据权限，指定返回数据
        String role = userMapper.getRole(username);
        if ("user".equals(role)){
            return resultMap.success().message("欢迎登录");
        }
        if ("admin".equals(role)){
            return resultMap.success().message("欢迎来到管理员页面");
        }
        return resultMap.fail().message("权限错误！");
    }
}
