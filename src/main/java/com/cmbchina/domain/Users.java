package com.cmbchina.domain;

/**
 * Created with IntelliJ IDEA.
 * com.cmbchina.domain.Users: ZhongYu Rong
 * Date: 2018/10/31
 * Time: 22:21
 */
public class Users {
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int userId;
    public String userName;
    public String password;


}
