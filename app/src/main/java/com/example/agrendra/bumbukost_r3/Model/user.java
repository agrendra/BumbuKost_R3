package com.example.agrendra.bumbukost_r3.Model;

/**
 * Created by agrendra on 17/01/18.
 */

public class user {
    private String nama, password;

    public user() {
    }

    public user(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
