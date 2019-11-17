package com.mlc.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
@Api(value = "用户接口")
public class UserController {

    @GetMapping("/{id}")
    @ApiOperation(value = "查询用户！",notes = "根据ID 查询用户！")
    public String getUserById(@PathVariable Long id){
        if(id !=null){
            System.out.println(id);
            return id+"成工调用！";
        }
        return "失败调用！";
    }
}
