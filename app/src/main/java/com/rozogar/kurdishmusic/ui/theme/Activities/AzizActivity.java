package com.rozogar.kurdishmusic.ui.theme.Activities;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.rozogar.kurdishmusic.R;
import com.rozogar.kurdishmusic.ui.theme.Adapter.FillingAdapter;
import com.rozogar.kurdishmusic.ui.theme.Model.MusicModel;

import java.util.ArrayList;

public class AzizActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    SwipeRefreshLayout refreshLayout;
    LinearLayoutManager verticalLayoutManager;
    ArrayList<MusicModel> azizmusicModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aziz);
        setupView();
        adding();
        music();

        FillingAdapter adapter = new FillingAdapter(azizmusicModel, this);
        recyclerView.setAdapter(adapter);
        verticalLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(verticalLayoutManager);

        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshLayout.setRefreshing(false);
            }
        });


    }

    private void music() {
        azizmusicModel = new ArrayList<>();
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_01),R.raw.aziz_waisi_01));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_02),R.raw.aziz_waisi_02));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_03),R.raw.aziz_waisi_03));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_04),R.raw.aziz_waisi_04));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_05),R.raw.aziz_waisi_05));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_06),R.raw.aziz_waisi_06));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_07),R.raw.aziz_waisi_07));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_08),R.raw.aziz_waisi_08));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_09),R.raw.aziz_waisi_09));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_10),R.raw.aziz_waisi_10));


    }

    public void transmit(MusicModel selectedMusicModel){
        Intent aziz = new Intent(AzizActivity.this, PlayActivity.class);
        // Pass the entire list
        aziz.putExtra("clickedMusicModel", azizmusicModel);
        // Pass the index of the selected music model
        aziz.putExtra("currentIndex", azizmusicModel.indexOf(selectedMusicModel));
        startActivity(aziz);
    }


    private void adding() {
        azizmusicModel = new ArrayList<>();
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_01)));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_02)));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_03)));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_04)));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_05)));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_06)));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_07)));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_08)));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_09)));
        azizmusicModel.add(new MusicModel(R.drawable.kurdish_icon, getString(R.string.aziz_waisi_10)));




    }


    private void setupView() {
        recyclerView = findViewById(R.id.recycle);
        refreshLayout = findViewById(R.id.refresher);


    }
}