package com.rozogar.kurdishmusic.ui.theme.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.rozogar.kurdishmusic.R;

public class MainActivity extends AppCompatActivity {
    private Button btnfreesongs;
    private Button btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUPView();
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
        btnfreesongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent song = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(song);
            }
        });

    }

    private void setUPView() {
        btnfreesongs = findViewById(R.id.btnfreesongs);
        btnExit = findViewById(R.id.btnExit);
    }
}