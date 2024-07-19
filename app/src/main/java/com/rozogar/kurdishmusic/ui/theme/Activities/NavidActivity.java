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

public class NavidActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    SwipeRefreshLayout refreshLayout;
    LinearLayoutManager verticalLayoutManager;
    ArrayList<MusicModel> navidmusicModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navid);
        setupView();
        zardi();
        navid();

        FillingAdapter adapter = new FillingAdapter(navidmusicModel, this);
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


    private void navid() {
        navidmusicModel = new ArrayList<>();
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 01",R.raw.navid1));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 02",R.raw.navid2));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 03",R.raw.navid3));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 04",R.raw.navid4));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 05",R.raw.navid5));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 06",R.raw.navid6));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 07",R.raw.navid7));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 08",R.raw.navid8));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 09",R.raw.navid9));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 10",R.raw.navid10));

    }

    public void convey(MusicModel selectedMusicModel){
        Intent navid = new Intent(NavidActivity.this, PlayActivity.class);
        // Pass the entire list
        navid.putExtra("clickedMusicModel", navidmusicModel);
        // Pass the index of the selected music model
        navid.putExtra("currentIndex", navidmusicModel.indexOf(selectedMusicModel));
        startActivity(navid);
    }



    private void zardi() {
        navidmusicModel = new ArrayList<>();
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 01"));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 02"));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 03"));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 04"));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 05"));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 06"));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 07"));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 08"));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 09"));
        navidmusicModel.add(new MusicModel(R.drawable.navid_zardi, "Navid Zardi 10"));

    }


    private void setupView() {
        recyclerView = findViewById(R.id.recycle);
        refreshLayout = findViewById(R.id.refresher);

    }

}
