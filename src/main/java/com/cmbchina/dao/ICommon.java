package com.cmbchina.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

/**
 * Created with IntelliJ IDEA.
 * com.cmbchina.domain.Users: ZhongYu Rong
 * Date: 2018/10/31
 * Time: 22:25
 */

@Mapper
public interface ICommon {

    @Select("select UserName from user where UserName=#{userName} and UserEmail=#{password}")
    public String login(@Param("userName") String userName, @Param("password") String password);

}
