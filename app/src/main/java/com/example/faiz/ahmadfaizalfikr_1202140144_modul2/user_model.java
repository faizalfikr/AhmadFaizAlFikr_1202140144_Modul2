package com.example.faiz.ahmadfaizalfikr_1202140144_modul2;

/**
 * Created by Faiz on 2/18/2018.
 */

public class user_model {

    private String name;
    private String harga;

    public user_model(String name, String harga) {
        this.name = name;
        this.harga = harga;
    }

    public user_model() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

}
