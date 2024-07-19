package com.rozogar.kurdishmusic.ui.theme.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.rozogar.kurdishmusic.R;
import com.rozogar.kurdishmusic.ui.theme.Model.SingerModel;

import java.util.ArrayList;



public class SingerAdapter extends BaseAdapter {
    private ArrayList<SingerModel> singersModel;
    private Context context;
    private ImageView singerImg;
    private TextView singerTxt;
    private View view;

    public SingerAdapter(ArrayList<SingerModel> singersModel, Context context) {
        this.singersModel = singersModel;
        this.context = context;
    }

    @Override
    public int getCount() {
        return singersModel.size();
    }

    @Override
    public Object getItem(int position) {
        return singersModel.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        view = LayoutInflater.from(context).inflate(R.layout.singer,parent,false);
        singerImg = view.findViewById(R.id.singerImg);
        singerTxt = view.findViewById(R.id.singerTxt);
        singerTxt.setText(singersModel.get(position).getSingersName());
        singerImg.setImageResource(singersModel.get(position).getSingersImage());
        return view;
    }

}
