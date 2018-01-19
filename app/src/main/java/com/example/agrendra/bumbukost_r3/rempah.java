package com.example.agrendra.bumbukost_r3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class rempah extends AppCompatActivity {

    Intent intent = new Intent();

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rempah);

        CustomListAdapter2 adapter = new CustomListAdapter2(this, namaRempah, imageRempah);
        GridView gridView = (GridView) findViewById(R.id.dataGrid);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posisi, long l) {
                switch (posisi) {
                    case 0:
                        intent = new Intent(rempah.this, detail.class);
                        intent.putExtra("judul", "Bawang Bombai");
                        intent.putExtra("detail", "");
                        intent.putExtra("gambar", R.drawable.bawang_bombai);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("judul", "Brokoli");
                        intent.putExtra("detail", "");
                        intent.putExtra("gambar", R.drawable.brokoli);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("judul", "Bawang Merah");
                        intent.putExtra("detail", "");
                        intent.putExtra("gambar", R.drawable.bwangmerah);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("judul", "Bawang Putih");
                        intent.putExtra("detail", "Ciri fisik Bawang Merah :\n" +
                                "        1. Batangnya berdiri tegak menjulang ke atas dan terbentuk dari pelepah – pelepah daun.\n" +
                                "        2. Akar yang dimilikinya adalah akar serabut berbentuk seperti sabut – sabut kecil.\n" +
                                "        3. Daunnya bergaris, datar dan kompak, selain itu tepi daun rata sedangkan ujung daun runcing.\n" +
                                "        4. Bunga bawang putih tersusun secara majemuk dalam bentuk payung sederhana yang muncul pada setiap anak umbi\n" +
                                "        5. Memiliki 6 daun letaknya di pangkal atau bebas, berbentuk memanjang dan meruncing.\n" +
                                "        6. Warna tandan bunga ada yang putih kehijauan hingga putih keunguan.\n" +
                                "        7. Setiap siung bawang putih diselubungi oleh 2 selaput putih seperti kertas\n" +
                                "        8. Setiap siung bawang putih bentuknya bulat pada bagian punggungnya, memiliki samping berbentuk rata dan tersudut.");
                        intent.putExtra("gambar", R.drawable.bwangputih);
                        startActivity(intent);
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        break;
                    case 16:
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;
                    default:
                        break;
                }
            }
        });

    }
}
