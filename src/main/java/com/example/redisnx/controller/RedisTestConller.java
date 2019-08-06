package com.example.redisnx.controller;

import com.example.redisnx.config.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: redis-nx
 * @BelongsPackage: com.example.redisnx.config.controller
 * @author: 刘森霄
 * @Date: 2019/08/06
 * @version:
 * @Description:
 */


@RestController
public class RedisTestConller {


    @Autowired
    RedisUtil redisUtils;

    @RequestMapping("test")
    public  String redisTest(){

      return  redisUtils.getJdies().toString();
    }
}
