package com.atguigu.spring5.entity;

/**
 * @author Leo
 * @date 2020/7/28 - 10:55
 */

public class Book {

    private String userId;
    private String username;
    private String ustatus;

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "Book{" + "userId=" + userId + ",username=" + username + ",ustatus=" + ustatus + "}";
    }
}
