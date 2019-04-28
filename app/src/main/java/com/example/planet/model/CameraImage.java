package com.example.planet.model;

<<<<<<< HEAD
public class CameraImage {

    // TODO: DELETE ME!!!

    private String date;
=======
import java.io.File;

public class CameraImage {
    private String date;
    private File image;

    public CameraImage(String date, File image) {
        this.date = date;
        this.image = image;
    }
>>>>>>> master

    public String getDate() {
        return date;
    }
<<<<<<< HEAD
=======

    public File getImage() {
        return image;
    }
>>>>>>> master
}
