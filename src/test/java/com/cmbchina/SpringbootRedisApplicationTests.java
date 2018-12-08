package com.cmbchina;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongYu Rong
 * Date: 2018/12/8
 * Time: 13:34
 */

import com.cmbchina.entity.Student;
import com.cmbchina.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

    @Autowired
    private RedisService service;

    @Test
    public void contextLoads() {
        service.set("myname", "chhliu");
        Student s = new Student();
        s.setId("001");
        s.setName("chhliu");
        s.setGrade("一年级");
        s.setAge("28");
        service.set(s);

        String name = service.get("myname");
        System.out.println("name:"+name);

        Student stu = service.getStudent("001");
        System.out.println(stu);
    }

}

