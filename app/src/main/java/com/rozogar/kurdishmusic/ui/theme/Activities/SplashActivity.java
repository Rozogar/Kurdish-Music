package com.rozogar.kurdishmusic.ui.theme.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.rozogar.kurdishmusic.R;
public class SplashActivity extends AppCompatActivity {

    Handler handler = new Handler();
    private TextView txtfun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setupView();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);

                startActivity(intent);
                finish();
            }
        }, 3000);
    }


    private void setupView() {
        txtfun = findViewById(R.id.txtfun);
    }
}