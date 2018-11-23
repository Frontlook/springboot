package com.cmbchina;


import com.cmbchina.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongYu Rong
 * Date: 2018/11/15
 * Time: 22:05
 */

@SpringBootTest
@RunWith(SpringRunner.class)
@Component
public class GreetingTest {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void set() {
        Object value = (Object)"李疆";
        redisUtil.set("lijiang", value);
    }

    @Test
    public void get() {
        System.out.print(redisUtil.get("lijiang"));
    }
}
