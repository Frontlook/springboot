package com.cmbchina.service;

import com.cmbchina.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongYu Rong
 * Date: 2018/12/8
 * Time: 13:33
 */
@Service("redisService")
public class RedisService {
    @Autowired //操作字符串的template，StringRedisTemplate是RedisTemplate的一个子集
    private StringRedisTemplate stringRedisTemplate;

    @Autowired  // RedisTemplate，可以进行所有的操作
    private RedisTemplate<String,Object> redisTemplate;

    public void set(String key, String value){
        stringRedisTemplate.opsForValue().set(key, value);
    }

    public void set(Student s){
        redisTemplate.opsForValue().set(s.getId(), s);
    }

    public String get(String key){
        return stringRedisTemplate.opsForValue().get(key);
    }

    public Student getStudent(String key){
        return (Student) redisTemplate.opsForValue().get(key);
    }
}
