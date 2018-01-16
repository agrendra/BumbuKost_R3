package com.example.agrendra.bumbukost_r3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class dataKategori extends AppCompatActivity {

    Intent intent = new Intent();
    ListView listView;

    String[] namaRempah = {
            "Cabe Hijau",
            "Cabe Merah",
            "Jahe",
            "Kunyit",
            "Lengkuas"
    };

    Integer[] imageRempah = {
            R.drawable.cabe_hijau,
            R.drawable.cabe_merah,
            R.drawable.jahe,
            R.drawable.kunyit,
            R.drawable.lengkuas
    };

    String[] namaMakanan = {
            "Nasi Goreng",
            "Sambal Goreng Kentang Tempe",
            "Telur Dadar Campur",
            "Terong Balodo",
            "Tumis Kacang Panjang",
            "Tumis Kangkung"
    };

    Integer[] imageMakanan = {
            R.drawable.nasi_goreng,
            R.drawable.sambel_goreng_kentang_tempe,
            R.drawable.telur_dadar_campur,
            R.drawable.terong_balado,
            R.drawable.tumis_kacang_panjang,
            R.drawable.tumis_kangkung
    };

    String[] namaMinuman = {
            "Citrus Squash",
            "Frappuccino",
            "Milo On Top",
            "Royal Hot Chocalate"
    };

    Integer[] imageMinum = {
            R.drawable.citrus_squash,
            R.drawable.frappuccino,
            R.drawable.milo_on_top,
            R.drawable.royal_hot_chocolate
    };

    String[] namaCemilan = {
            "Banana Chocolate Stick",
            "Bolu Kukus Kopi"
    };

    Integer[] imageCemilan =  {
            R.drawable.banana_chocolate_stick,
            R.drawable.bolu_kukus_kopi
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_kategori);

        listView = (ListView)findViewById(R.id.data);
        intent = getIntent();
        String data = intent.getStringExtra("Kategori");
        if(data.equals("Rempah Rempah")){
            CustomListAdapter adapter = new CustomListAdapter(this, namaRempah, imageRempah);
            listView.setAdapter(adapter);
        }
        else if (data.equals("Makanan")){
            CustomListAdapter adapter = new CustomListAdapter(this, namaMakanan, imageMakanan);
            listView.setAdapter(adapter);
        }
        else if(data.equals("Minuman")){
            CustomListAdapter adapter = new CustomListAdapter(this, namaMinuman, imageMinum);
            listView.setAdapter(adapter);

        }else{
            CustomListAdapter adapter = new CustomListAdapter(this, namaCemilan, imageCemilan);
            listView.setAdapter(adapter);
        }

    }
}
