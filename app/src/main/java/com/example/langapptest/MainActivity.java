package com.example.langapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompat {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton en = findViewById(R.id.btn_en);
        ImageButton kr = findViewById(R.id.btn_ko);
        ImageButton kh = findViewById(R.id.btn_kh);
        ImageButton es = findViewById(R.id.btn_es);

        LanguageManager lang = new LanguageManager(this);
        en.setOnClickListener(view -> {
            lang.updateResource("en");
            recreate();
        });
        kr.setOnClickListener(view -> {
            lang.updateResource("ko");
            recreate();
        });
        kh.setOnClickListener(view -> {
            lang.updateResource("km");
            recreate();
        });
        es.setOnClickListener(view -> {
            lang.updateResource("es");
            recreate();
        });

        findViewById(R.id.btn_go).setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

    }
}