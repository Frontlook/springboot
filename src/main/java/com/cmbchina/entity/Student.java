package com.cmbchina.entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongYu Rong
 * Date: 2018/12/8
 * Time: 13:35
 */
public class Student implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String id;

    private String name;

    private String age;

    private String grade;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
// 省略getter,setter
    /**
     * attention:
     * Details：TODO
     * @author chhliu
     * 创建时间：2017-1-18 下午2:24:39
     * @return
     */
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age
                + ", grade=" + grade + "]";
    }
}