package com.example.redisnx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: redis-nx
 * @BelongsPackage: com.example.redisnx.config
 * @author: 刘森霄
 * @Date: 2019/08/06
 * @version:
 * @Description:
 */
@Configuration
public class RedisConfig {


    @Bean
    public  RedisUtil getRedisUtil(){

        RedisUtil redisUtil = new RedisUtil();

        redisUtil.initPoll("localhost",6379, 0);

        return  redisUtil;
    }


}
