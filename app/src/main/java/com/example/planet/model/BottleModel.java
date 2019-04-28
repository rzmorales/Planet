package com.example.planet.model;

import java.io.File;

public class BottleModel {
    private String date;
    private File image;
    private int consumtionScore;
    private int recyclingScore;

    public int getConsumtionScore() {
        return consumtionScore;
    }

    public int getRecyclingScore() {
        return recyclingScore;
    }

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
