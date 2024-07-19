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

public class AyatActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    SwipeRefreshLayout refreshLayout;
    LinearLayoutManager verticalLayoutManager;
    ArrayList<MusicModel> ayamusicModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat);
        setupView();
        ahmadinezhad();
        ayat();

        FillingAdapter adapter = new FillingAdapter(ayamusicModel, this);
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

    private void ayat() {
        ayamusicModel = new ArrayList<>();
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 01", R.raw.ayat1));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 02", R.raw.ayat2));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 03", R.raw.ayat3));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 04", R.raw.ayat4));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 05", R.raw.ayat5));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 06", R.raw.ayat6));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 07", R.raw.ayat7));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 08", R.raw.ayat8));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 09", R.raw.ayat9));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 10", R.raw.ayat10));

    }

    public void go(MusicModel selectedMusicModel) {
        Intent ayat = new Intent(AyatActivity.this, PlayActivity.class);
        // Pass the entire list
        ayat.putExtra("clickedMusicModel", ayamusicModel);
        // Pass the index of the selected music model
        ayat.putExtra("currentIndex", ayamusicModel.indexOf(selectedMusicModel));
        startActivity(ayat);
    }


    private void ahmadinezhad() {
        ayamusicModel = new ArrayList<>();
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 01"));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 02"));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 03"));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 04"));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 05"));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 06"));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 07"));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 08"));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 09"));
        ayamusicModel.add(new MusicModel(R.drawable.ayat, "Ayat Ahmad Nezhad 10"));

    }


    private void setupView() {
        recyclerView = findViewById(R.id.recycle);
        refreshLayout = findViewById(R.id.refresher);


    }
}
