package com.example.marcin.plockrowery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Lupa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa);

    }
    public void pokazProfil (View view){
        startActivity(new Intent(Lupa.this, Profil.class));
    }
    public void pokazLupe (View view){
        startActivity(new Intent(Lupa.this, Lupa.class));
    }
    public void pokazZaplanuj (View view){ startActivity(new Intent(Lupa.this, Zaplanuj.class));}
    public void pokazRanking (View view){ startActivity(new Intent(Lupa.this, Ranking.class));}
    public void pokazTrasy (View view){ startActivity(new Intent(Lupa.this, Trasy.class));

    }
}
