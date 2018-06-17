package com.example.marcin.plockrowery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class Zaplanuj extends AppCompatActivity {


    Switch switchButton, switchButton2;
    EditText editText;
    String switchOn = "Czas";
    String switchOff = "Kilometry" ;
    EditText editText2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zaplanuj);

        switchButton = (Switch) findViewById(R.id.switch1);
        editText = (EditText) findViewById(R.id.editText);

        //switchButton.setChecked(true);
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    editText.setHint(switchOn);
                   // editText2.setVisibility(View.VISIBLE);
                } else {
                    editText.setHint(switchOff);
                    //editText2.setVisibility(View.INVISIBLE);
                }
            }
        });

        }


    public void pokazProfil (View view){
        startActivity(new Intent(Zaplanuj.this, Profil.class));
    }
    public void pokazLupe (View view){ startActivity(new Intent(Zaplanuj.this, Lupa.class)); }
    public void pokazTrasy (View view){ startActivity(new Intent(Zaplanuj.this, Trasy.class)); }
    public void pokazRanking (View view){ startActivity(new Intent(Zaplanuj.this, Ranking.class));}
    public void pokazZaplanuj (View view){ startActivity(new Intent(Zaplanuj.this, Zaplanuj.class));}
    public void pokazDalej (View view){ startActivity(new Intent(Zaplanuj.this, Dalej.class));}
    public void pokazOpcje (View view){ startActivity(new Intent(Zaplanuj.this, Opcje.class));}
    public void pokazPoczatek (View view){ startActivity(new Intent(Zaplanuj.this, Poczatek.class));}





}
