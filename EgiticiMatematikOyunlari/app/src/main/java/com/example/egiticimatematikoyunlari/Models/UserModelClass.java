package com.example.egiticimatematikoyunlari.Models;

import java.io.Serializable;

public class UserModelClass implements Serializable {
    private String name,email,pass;

    public UserModelClass() {
    }

    public UserModelClass(String name, String email, String pass) {
        this.name = name;
        this.email = email;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
