package com.example.marcin.plockrowery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Opcje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcje);
    }
        public void pokazTraseDluga (View view){ startActivity(new Intent(Opcje.this, TrasaDluga.class));}
}

