package com.example.planet.model;

import java.io.File;

public class BottleModel {
    private String date;
    private File image;
    private int consumptionTally;
    private int recycleTally;

    public BottleModel(String date, File image, int consumptionTally, int recycleTally) {
        this.date = date;
        this.image = image;
        this.consumptionTally = consumptionTally;
        this.recycleTally = recycleTally;
    }

    public BottleModel(String date, File image) {
        this.date = date;
        this.image = image;
    }

    public int getConsumptionTally() {
        return consumptionTally;
    }

    public int getRecycleTally() {
        return recycleTally;
    }

    public String getDate() {
        return date;
    }

    public File getImage() {
        return image;
    }

}
