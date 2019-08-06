package com.example.redisnx.config;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @BelongsProject: redis-nx
 * @BelongsPackage: com.example.redisnx.config
 * @author: 刘森霄
 * @Date: 2019/08/06
 * @version:
 * @Description:
 */
public class RedisUtil {


    private  JedisPool jedisPool;
    public void  initPoll(String host,int port ,int database){


        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();

        jedisPoolConfig.setMaxTotal(200);
        jedisPoolConfig.setMaxIdle(30);
        jedisPoolConfig.setBlockWhenExhausted(true);
        jedisPoolConfig.setMaxWaitMillis(10*1000);
        jedisPoolConfig.setTestOnBorrow(true);
         jedisPool = new JedisPool(jedisPoolConfig, host, port, 20 * 1000);
    }

    public Jedis getJdies(){

        Jedis jedis = jedisPool.getResource();

        return  jedis;
    }

}
