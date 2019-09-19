package com.example.shiro.Controller;

import com.example.shiro.model.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName ExceptionController
 * @Author 吴灿洪
 * @Description
 * @Date 2019/9/17 18:01
 * @Version 1.0
 */
@RestControllerAdvice
public class ExceptionController {

    private final ResultMap resultMap;

    @Autowired
    public ExceptionController(ResultMap resultMap) {
        this.resultMap = resultMap;
    }

    //捕捉 CustomerRealm 抛出的异常
    @ExceptionHandler
    public ResultMap handleShiroException(Exception ex){
        return resultMap.fail().message(ex.getMessage());
    }
}
