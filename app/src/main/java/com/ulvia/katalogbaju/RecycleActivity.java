package com.ulvia.katalogbaju;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class RecycleActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    //deklarasi variable
    private ArrayList<String> Names = new ArrayList<>();
    private ArrayList<String> ImageUrl = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        Log.d(TAG, "onCreate:started.");

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        ImageUrl.add("https://muslimore.com//uploads/products/data/gamis-dress-wanita-zoya-enisa-dress.jpg");
        Names.add("Harumi Dress");

        ImageUrl.add("https://modelbaju2019.info/wp-content/uploads/2018/11/321-Model-Baju-Muslim-Terbaru-Zoya-2018.jpg");
        Names.add("Kanaka Dress");

        ImageUrl.add("https://3.bp.blogspot.com/-oBtT5IUpacY/W8GOg-tIhLI/AAAAAAAAA0Q/6LoJekZkbfoOE6sfPD1JI7H58coaR_drwCK4BGAYYCw/s600/gambar-dress-modern-muslimah.jpg");
        Names.add("Donelia Dress");

        ImageUrl.add("http://nibinebu.com/wp-content/uploads/2015/11/zoya-muslim.jpg");
        Names.add("Hafana Dress");

        ImageUrl.add("http://bajumuslimodern.com/wp-content/uploads/2017/02/Tampilan-Gamis-Muslim-Modern-Brand-Zoya-Paling-Cantik.png");
        Names.add("Rizni Dress");

        ImageUrl.add("https://muslimore.com//uploads/products/data/gamis-dress-wanita-zoya-khalea-dress.jpg");
        Names.add("Zulfah Dress");

        ImageUrl.add("https://gambarbusanamuslim.net/wp-content/uploads/2017/09/Gambar-Model-Gamis-Zoya-Terbaru.jpg");
        Names.add("Rolla Dress");

        ImageUrl.add("https://muslimore.com//uploads/products/data/gamis-dress-wanita-zoya-qasilda-dress.jpg");
        Names.add("Melinza Dress");

        ImageUrl.add("https://fashionmuslim.info/wp-content/uploads/2018/10/Gamis-Zoya-Model-Baru-2019.jpg");
        Names.add("Montana Dress                                                                 7");
        initRecyclerView();
    }

    private void initRecyclerView() {
    }


}
