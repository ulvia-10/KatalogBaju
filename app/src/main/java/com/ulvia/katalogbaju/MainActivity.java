package com.ulvia.katalogbaju;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BackPress(View view) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void DressPress(View view) {
        Intent intent = new Intent(MainActivity.this, RecycleActivity.class);
        startActivity(intent);
    }

    public void BagsPress(View view) {
        Intent intent = new Intent(MainActivity.this, RecycleActivity.class);
        startActivity(intent);
    }

    public void ShoesPress(View view) {
        Intent intent = new Intent(MainActivity.this, RecycleActivity.class);
        startActivity(intent);
    }
}
