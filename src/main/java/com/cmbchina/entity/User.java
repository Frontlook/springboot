package com.cmbchina.entity;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userId
     *
     * @mbggenerated Sun Nov 25 12:45:58 CST 2018
     */
    private Boolean userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.UserName
     *
     * @mbggenerated Sun Nov 25 12:45:58 CST 2018
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.UserEmail
     *
     * @mbggenerated Sun Nov 25 12:45:58 CST 2018
     */
    private String useremail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.location
     *
     * @mbggenerated Sun Nov 25 12:45:58 CST 2018
     */
    private Integer location;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userId
     *
     * @return the value of user.userId
     *
     * @mbggenerated Sun Nov 25 12:45:58 CST 2018
     */
    public Boolean getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userId
     *
     * @param userid the value for user.userId
     *
     * @mbggenerated Sun Nov 25 12:45:58 CST 2018
     */
    public void setUserid(Boolean userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.UserName
     *
     * @return the value of user.UserName
     *
     * @mbggenerated Sun Nov 25 12:45:58 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.UserName
     *
     * @param username the value for user.UserName
     *
     * @mbggenerated Sun Nov 25 12:45:58 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.UserEmail
     *
     * @return the value of user.UserEmail
     *
     * @mbggenerated Sun Nov 25 12:45:58 CST 2018
     */
    public String getUseremail() {
        return useremail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.UserEmail
     *
     * @param useremail the value for user.UserEmail
     *
     * @mbggenerated Sun Nov 25 12:45:58 CST 2018
     */
    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.location
     *
     * @return the value of user.location
     *
     * @mbggenerated Sun Nov 25 12:45:58 CST 2018
     */
    public Integer getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.location
     *
     * @param location the value for user.location
     *
     * @mbggenerated Sun Nov 25 12:45:58 CST 2018
     */
    public void setLocation(Integer location) {
        this.location = location;
    }
}