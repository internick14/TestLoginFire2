package com.example.jose.testloginfire2.Model;

/**
 * Created by josetrinidad on 22/01/18.
 */

public class User {
    private String Name;
    private String Password;

    public User(){}

    public User(String name, String password) {
        Name = name;
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
