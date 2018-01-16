package com.example.agrendra.bumbukost_r3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout minuman, makanan, rempah, cemilan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minuman = (RelativeLayout) findViewById(R.id.minuman);
        makanan = (RelativeLayout) findViewById(R.id.makanan);
        rempah = (RelativeLayout) findViewById(R.id.rempah);
        cemilan = (RelativeLayout) findViewById(R.id.cemilan);


        minuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, dataKategori.class);
                intent.putExtra("Kategori","Minuman");
                startActivity(intent);
            }
        });

        makanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, dataKategori.class);
                intent.putExtra("Kategori","Makanan");
                startActivity(intent);
            }
        });

        cemilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, dataKategori.class);
                intent.putExtra("Kategori","Cemilan");
                startActivity(intent);
            }
        });

        rempah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, dataKategori.class);
                intent.putExtra("Kategori","Rempah Rempah");
                startActivity(intent);
            }
        });

    }


}
