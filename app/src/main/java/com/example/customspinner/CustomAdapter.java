package com.example.customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] countryNames;
    int[] imgflags;

    public CustomAdapter(Context appContext,String[] countryNames,int[] imgflags)
    {
        this.context=appContext;
        this.countryNames=countryNames;
        this.imgflags=imgflags;
    }


    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.spinner_itmes,null);
        TextView txtName=view.findViewById(R.id.txtName);
        txtName.setText(countryNames[position]);
        ImageView imgview=view.findViewById(R.id.imageView);
        imgview.setImageResource(imgflags[position]);

        return view;
    }



}
