package com.example.agrendra.bumbukost_r3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class detail extends AppCompatActivity {

    int  gambar;
    Intent intent = new Intent();
    GridView gridView;

    String[] itemname = {

    };

    String[] descriptionItem = {

    };

    Integer[] imgid = {

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


    }
}
