package com.example.shiro.Controller;

import com.example.shiro.model.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AdminController
 * @Author 吴灿洪
 * @Description 管理员
 * @Date 2019/9/12 17:10
 * @Version 1.0
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    private final ResultMap resultMap;

    @Autowired
    public AdminController(ResultMap resultMap) {
        this.resultMap = resultMap;
    }

    @GetMapping("/getMessage")
    public ResultMap getMessage(){
        return resultMap.success().message("您拥有管理员权限，可以获得该接口的信息！");
    }
}
