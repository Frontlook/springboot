package com.cmbchina.config;

import com.cmbchina.util.MyInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongYu Rong
 * Date: 2018/11/4
 * Time: 20:16
 */

//@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        //addPathPatterns("/**")对所有请求都拦截，但是排除了/others和/login请求的拦截
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/*").excludePathPatterns("/login");
        super.addInterceptors(registry);
    }
}
