package com.example.crossbylite.fourtyapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class StartWindow {

    private String username;
    private String password;

    public StartWindow(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
