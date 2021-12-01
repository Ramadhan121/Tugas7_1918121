package com.example.tugas7_1918121;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List <kos> kos;
    public CustomListAdapter(Activity activity, List<kos> kos) {
        this.activity = activity;
        this.kos = kos;
    }
    @Override
    public int getCount() {
        return kos.size();
    }
    @Override
    public Object getItem(int location) {
        return kos.get(location);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup
            parent) {
        if (inflater == null)
            inflater = (LayoutInflater) activity

                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.custom_list,
                    null);
        TextView nama = (TextView)
                convertView.findViewById(R.id.text_nama);
        TextView antrian = (TextView)
                convertView.findViewById(R.id.text_antrian);
        ImageView imageView = (ImageView)
                convertView.findViewById(R.id.iconid);
        kos m = kos.get(position);
        nama.setText("Nama : "+ m.get_nama());
        antrian.setText("Kelas : "+ m.get_kelas());
        return convertView;
    }
}
