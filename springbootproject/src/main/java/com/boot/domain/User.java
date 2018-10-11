package com.boot.domain;

/**
 * @author 张明亮
 * @date 2018/10/9 15:13
 */
public class User {
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userEmail;

    public User() {
    }

    public User(Integer userId, String userName, String userPassword, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", userName='" + userName + '\'' + ", userPassword='" + userPassword + '\'' + ", userEmail='" + userEmail + '\'' + '}';
    }
}
