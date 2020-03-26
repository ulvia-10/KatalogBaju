package com.ulvia.katalogbaju.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Image extends AbstractItem<> {
    private String image;
    public Image(String image) {
        this.image = image;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

