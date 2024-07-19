package com.rozogar.kurdishmusic.ui.theme.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


import androidx.appcompat.app.AppCompatActivity;

import com.rozogar.kurdishmusic.R;
import com.rozogar.kurdishmusic.ui.theme.Adapter.SingerAdapter;
import com.rozogar.kurdishmusic.ui.theme.Model.SingerModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private GridView gridView;
    private ArrayList<SingerModel> singer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupView();
        fillArray();

        SingerAdapter adapter = new SingerAdapter( singer, this);
        gridView.setAdapter(adapter);
        setClickonItem();
    }

    private void setClickonItem() {
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0: {
                        Intent aziz = new Intent(HomeActivity.this, AzizActivity.class);
                        startActivity(aziz);
                        break;
                    } case 1: {
                        Intent navid = new Intent(HomeActivity.this, NavidActivity.class);
                        startActivity(navid);
                        break;
                    } case 2:{
                        Intent ayat = new Intent(HomeActivity.this, AyatActivity.class);
                        startActivity(ayat);
                        break;
                    } case 3: {
                        Intent fariborz = new Intent(HomeActivity.this, FariborzActivity.class);
                        startActivity(fariborz);
                        break;
                    }

                }

            }
        });
    }

    private void fillArray() {
        singer = new ArrayList<>();
        singer.add(new SingerModel(R.drawable.aziz, getString(R.string.aziz_waisi)));
        singer.add(new SingerModel(R.drawable.navid, getString(R.string.navid_zardi)));
        singer.add(new SingerModel(R.drawable.ayat_ahmadnezhad, getString(R.string.ayat_ahmadnezhad)));
        singer.add(new SingerModel(R.drawable.fariborz_namdari, getString(R.string.fariborz_namdari)));
        singer.add(new SingerModel(R.drawable.roohollah_karami, getString(R.string.rohollah_karami)));
        singer.add(new SingerModel(R.drawable.ramin_karami, getString(R.string.ramin_karami)));
        singer.add(new SingerModel(R.drawable.mohamad_amiri, getString(R.string.mohammad_amiri)));
        singer.add(new SingerModel(R.drawable.msoud_jalilian, getString(R.string.masoud_jalilian)));
    }
    private void setupView() {
        gridView = findViewById(R.id.gridview);
    }
}