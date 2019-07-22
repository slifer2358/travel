package com.baize.domain;



import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
   private Integer userId ;
   private String username;
   private String password ;
   private String userTel;
   private int userType;
   private double userAvails;
   private Date createTime;
   private Date updateTime;
   private String userEmail;
   private int flag;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userType=" + userType +
                ", userAvails=" + userAvails +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", userEmail='" + userEmail + '\'' +
                ", flag=" + flag +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public double getUserAvails() {
        return userAvails;
    }

    public void setUserAvails(double userAvails) {
        this.userAvails = userAvails;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
