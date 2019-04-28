package com.example.planet.model;

import java.io.File;

public class BottleModel {
    private String date;
    private File image;



    public BottleModel(String date, File image) {
        this.date = date;
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public File getImage() {
        return image;
    }

}
