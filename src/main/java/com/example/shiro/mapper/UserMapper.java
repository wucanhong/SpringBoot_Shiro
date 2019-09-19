package com.example.shiro.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserMapper
 * @Author 吴灿洪
 * @Description
 * @Date 2019/9/12 15:30
 * @Version 1.0
 */
@Repository
public interface UserMapper {

    //获取密码
    String getPassword(@Param("username") String username);

    //获取角色权限
    String getRole(@Param("username") String username);
}
