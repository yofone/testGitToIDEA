package com.test.dao;

import java.util.Date;

/**
 * Created by Lan on 2017/5/11.
 */
public class User {
    private int id;
    private String userName;
    private String password;

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }


}
