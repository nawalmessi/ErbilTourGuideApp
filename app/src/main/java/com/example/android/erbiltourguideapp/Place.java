package com.example.android.erbiltourguideapp;

/**
 * Created by High Spec on 10/16/2017.
 */

public class Place {
    private String name;
    private String address;
    private int image;


    public Place(String name, String address, int image) {
        this.name = name;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getImage() {
        return image;
    }


}