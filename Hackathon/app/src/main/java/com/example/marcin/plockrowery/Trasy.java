package com.example.marcin.plockrowery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Trasy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trasy);
    }
    public void pokazProfil (View view){
        startActivity(new Intent(Trasy.this, Profil.class));
    }
    public void pokazLupe (View view){
        startActivity(new Intent(Trasy.this, Lupa.class));
    }
    public void pokazZaplanuj (View view){ startActivity(new Intent(Trasy.this, Zaplanuj.class));}
    public void pokazRanking (View view){ startActivity(new Intent(Trasy.this, Ranking.class));}
    public void pokazTrasy (View view){ startActivity(new Intent(Trasy.this, Trasy.class));

    }
}
