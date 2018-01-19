package com.example.agrendra.bumbukost_r3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class dataKategori2 extends AppCompatActivity {

    Intent intent = new Intent();
    GridView gridView;
    String data;

    String[] namaRempah = {
            "Bawang bombai",
            "Brokoli",
            "Bawang Merah",
            "Bawang Putih",
            "Cabe Merah",
            "Daun Bawang",
            "Daun Selada",
            "Jagung",
            "Kentang",
            "Kol",
            "Paprika Kuning",
            "Paprika Merah",
            "Pete",
            "Sawi",
            "Selada",
            "Timun",
            "Tomat",
            "Terong",
            "Ubi jalar",
            "Wortel"
    };

    Integer[] imageRempah = {
            R.drawable.bawang_bombai,
            R.drawable.brokoli,
            R.drawable.bwangmerah,
            R.drawable.bwangputih,
            R.drawable.cabe,
            R.drawable.daunbawang,
            R.drawable.daun_selada,
            R.drawable.jagung,
            R.drawable.kentang,
            R.drawable.koll,
            R.drawable.paprikahiaju,
            R.drawable.parika_merah,
            R.drawable.pete,
            R.drawable.sawi,
            R.drawable.selada,
            R.drawable.timun,
            R.drawable.tomat,
            R.drawable.trong,
            R.drawable.ubi,
            R.drawable.wortel


    };

    String[] namaMakanan = {
            "Ayam Goreng",
            "Ikan Bakar",
            "Rendang",
            "Semur Jengkol",
            "Staek",
            "Telor Ceplok"
    };

    Integer[] imageMakanan = {
            R.drawable.aym,
            R.drawable.ikan_bakar,
            R.drawable.rendang,
            R.drawable.semurjengkol,
            R.drawable.staek,
            R.drawable.telor
    };

    String[] namaMinuman = {
            "Soda",
            "Es Marimas",
            "Cofee",
            "Ice Coffe",
            "Cofee Cup",
            "Juice jeruk",
            "Juice ",
            "Tea"
    };

    Integer[] imageMinum = {
            R.drawable.soda,
            R.drawable.esmarimas,
            R.drawable.cofe,
            R.drawable.ice_cofe,
            R.drawable.cofecup,
            R.drawable.juice,
            R.drawable.juice1,
            R.drawable.te
    };

    String[] namaCemilan = {

    };

    Integer[] imageCemilan = {

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_kategori2);

        gridView = (GridView) findViewById(R.id.dataGrid);
        intent = getIntent();
        data = intent.getStringExtra("Kategori");

        if (data.equals("Rempah Rempah")) {
            CustomListAdapter2 adapter = new CustomListAdapter2(this, namaRempah, imageRempah);
            gridView.setAdapter(adapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    switch (i){
                        case 0:
                            intent = new Intent(dataKategori2.this,detail.class);
                            intent.putExtra("menu","bawangbombai");
                            startActivity(intent);
                            break;
                        case 1:
                            intent = new Intent(dataKategori2.this,detail.class);
                            intent.putExtra("menu","brokoli");
                            startActivity(intent);
                            break;
                        default:
                            break;
                    }
                }
            });
        } else if (data.equals("Makanan")) {
            CustomListAdapter2 adapter = new CustomListAdapter2(this, namaMakanan, imageMakanan);
            gridView.setAdapter(adapter);
        } else if (data.equals("Minuman")) {
            CustomListAdapter2 adapter = new CustomListAdapter2(this, namaMinuman, imageMinum);
            gridView.setAdapter(adapter);
        } else {
            CustomListAdapter2 adapter = new CustomListAdapter2(this, namaCemilan, imageCemilan);
            gridView.setAdapter(adapter);
        }
    }
}
