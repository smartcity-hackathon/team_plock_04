package com.example.marcin.plockrowery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Ranking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

    }
    public void pokazProfil (View view){
        startActivity(new Intent(Ranking.this, Profil.class));
    }
    public void pokazLupe (View view){ startActivity(new Intent(Ranking.this, Lupa.class)); }
    public void pokazZaplanuj (View view){ startActivity(new Intent(Ranking.this, Zaplanuj.class));}
    public void pokazTrasy (View view){ startActivity(new Intent(Ranking.this, Trasy.class));}
    public void pokazRanking (View view){ startActivity(new Intent(Ranking.this, Ranking.class));

    }
}
