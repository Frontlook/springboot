package com.cmbchina.domain;

import org.springframework.cache.annotation.Cacheable;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongYu Rong
 * Date: 2018/11/18
 * Time: 14:13
 */

public class Book {
    /**
     * value : 缓存的名字  ,key ： 缓存map中的key
     *
     * @param id
     * @return
     */
    @Cacheable(value = {"sampleCache"}, key = "#id")
    public String getBook(int id) {
        System.out.println("Method executed..");
        if (id == 1) {
            return "Book 1";
        } else {
            return "Book 2";
        }
    }
}
