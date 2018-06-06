package com.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private String id;
    private int user;
    private int pass;

    public Account() {
    }

    public Account(String id, int user, int pass) {
        this.id = id;
        this.user = user;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        System.out.println(pass + "   ***   " + this);
        this.pass = pass;
    }

}
