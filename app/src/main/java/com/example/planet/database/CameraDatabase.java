package com.example.planet.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.planet.model.CameraImage;

import java.io.File;
import java.util.LinkedList;

public class CameraDatabase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "BOTTLES_DATABASE.db";
    private static final String TABLE_NAME = "Bottles";
    private static final int SCHEMA_VERSION = 1;
    private static CameraDatabase instance;
    private static final String IMAGE_KEY = "image";
    private static final String DATE_KEY = "date";

    public CameraDatabase( Context context) {
        super(context, DATABASE_NAME, null, SCHEMA_VERSION);
    }
    public static CameraDatabase getInstance(Context context) {
        if (instance == null) {
            instance = new CameraDatabase(context);
        }
        return instance;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE " + TABLE_NAME +
                        " (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "date TEXT, image TEXT);");
    }
    public void addCameraImage(CameraImage cameraImage) {
        Cursor cursor = getReadableDatabase().rawQuery(
                "SELECT * FROM " + TABLE_NAME + " WHERE date = '" +
                        cameraImage.getDate() + "';", null);
        if (cursor.getCount() == 0) {
            getWritableDatabase().execSQL("INSERT INTO " + TABLE_NAME +
                    "(date, image ) VALUES('" + cameraImage.getDate() + "', '" + cameraImage.getImage().getAbsolutePath() + "');");
            cursor.close();
        }
        cursor.close();
    }

    public LinkedList<CameraImage> getCameraImageList() {
        LinkedList<CameraImage> studentList = new LinkedList<>();
        Cursor cursor = getReadableDatabase().rawQuery(
                "SELECT * FROM " + TABLE_NAME + ";", null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                do {
                    CameraImage cameraImage = new CameraImage(
                            cursor.getString(cursor.getColumnIndex(DATE_KEY)),
                            new File(cursor.getString(cursor.getColumnIndex(IMAGE_KEY))));
                    studentList.add(cameraImage);
                } while (cursor.moveToNext());
            }
            cursor.close();
        }
        return studentList;
    }
}
