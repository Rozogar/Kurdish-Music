package com.rozogar.kurdishmusic.ui.theme.Activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.rozogar.kurdishmusic.R;
import com.rozogar.kurdishmusic.ui.theme.Adapter.FillingAdapter;
import com.rozogar.kurdishmusic.ui.theme.Model.MusicModel;

import java.util.ArrayList;

public class FariborzActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    SwipeRefreshLayout refreshLayout;
    LinearLayoutManager verticalLayoutManager;
    ArrayList<MusicModel> freemusicModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fariborz);
        setupView();
        namdari();
        fariborz();

        FillingAdapter adapter = new FillingAdapter(freemusicModel, this);
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

    private void fariborz() {
        freemusicModel = new ArrayList<>();
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 01", R.raw.fariborz1));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 02", R.raw.fariborz2));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 03", R.raw.fariborz3));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 04", R.raw.fariborz4));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 05", R.raw.fariborz5));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 06", R.raw.fariborz6));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 07", R.raw.fariborz7));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 08", R.raw.fariborz8));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 09", R.raw.fariborz9));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 10", R.raw.fariborz10));


    }

    public void transform(MusicModel selectedMusicModel) {
        Intent free = new Intent(FariborzActivity.this, PlayActivity.class);
        // Pass the entire list
        free.putExtra("clickedMusicModel", freemusicModel);
        // Pass the index of the selected music model
        free.putExtra("currentIndex", freemusicModel.indexOf(selectedMusicModel));
        startActivity(free);
    }


    public void trans(MusicModel selectedMusicModel) {
        Intent free = new Intent(FariborzActivity.this, PlayActivity.class);
        // Pass the entire list
        free.putExtra("clickedMusicModel", freemusicModel);
        // Pass the index of the selected music model
        free.putExtra("currentIndex", freemusicModel.indexOf(selectedMusicModel));
        startActivity(free);
    }


    private void namdari() {
        freemusicModel = new ArrayList<>();
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 01"));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 02"));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 03"));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 04"));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 05"));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 06"));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 07"));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 08"));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 09"));
        freemusicModel.add(new MusicModel(R.drawable.fariborz, "Fariborze Namdari 10"));

    }


    private void setupView() {
        recyclerView = findViewById(R.id.recycle);
        refreshLayout = findViewById(R.id.refresher);


    }
}