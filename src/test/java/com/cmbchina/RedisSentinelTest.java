package com.cmbchina;

/**
 * 这个测试类用于测试sentinel哨兵处理主从服务器down机问题
 * Created with IntelliJ IDEA.
 * User: ZhongYu Rong
 * Date: 2018/12/8
 * Time: 13:48
 */
import java.util.HashSet;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;

public class RedisSentinelTest {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Set<String> sentinels = new HashSet<String>();
        String hostAndPort1 = "127.0.0.1:26379";

        sentinels.add(hostAndPort1);
        String clusterName = "mymaster";
        JedisSentinelPool redisSentinelJedisPool = new JedisSentinelPool(clusterName,sentinels);

        Jedis jedis = null;
        try {
            jedis = redisSentinelJedisPool.getResource();
            jedis.set("key", "value");
            System.out.println(jedis.get("key"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            redisSentinelJedisPool.returnBrokenResource(jedis);
        }

        redisSentinelJedisPool.close();
    }

}