package com.cmbchina.config;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongYu Rong
 * Date: 2018/11/18
 * Time: 14:14
 */

import java.util.Arrays;

import com.cmbchina.domain.Book;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * spring cache 缓存的使用
 * @author Administrator
 *
 */
@Configuration
@EnableCaching
public class CachingConfig {
    @Bean
    public Book book() {
        return new Book();
    }

    @Bean
    public CacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        //注册名为sampleCache的缓存
        cacheManager.setCaches(Arrays.asList(new ConcurrentMapCache("sampleCache")));
        return cacheManager;
    }


    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CachingConfig.class);
        ctx.refresh();
        Book book = ctx.getBean(Book.class);
        // calling getBook method first time.
        System.out.println(book.getBook(1));
        // calling getBook method second time. This time, method will not
        // execute.
        System.out.println(book.getBook(1));
        // calling getBook method third time with different value.
        System.out.println(book.getBook(2));
        ctx.close();
    }
}

