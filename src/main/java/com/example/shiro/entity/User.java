package com.example.shiro.entity;

import lombok.Data;

/**
 * @ClassName User
 * @Author 吴灿洪
 * @Description
 * @Date 2019/9/12 15:27
 * @Version 1.0
 */
@Data
public class User {

    private Integer id;
    private String username;
    private String password;
    private String role;
}
