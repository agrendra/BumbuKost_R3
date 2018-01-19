package com.example.agrendra.bumbukost_r3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sanriomisintaro on 10/27/17.
 */

public class ca extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final String[] descriptionItem;
    private final Integer[] imgid;

    public ca(Activity context, String[] itemname, Integer[] imgid, String[] descriptionItem) {
        super(context, R.layout.list_data2, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.descriptionItem=descriptionItem;
        this.imgid=imgid;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_data2, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.txtJudul);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageId);
        TextView extratxt = (TextView) rowView.findViewById(R.id.txtDetails);

        //dari instansiasi diatas, dimasukkan data yang diambil dari array yang ada di MainActivity
        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText("Description "+descriptionItem[position]);
        return rowView;

    };
}
