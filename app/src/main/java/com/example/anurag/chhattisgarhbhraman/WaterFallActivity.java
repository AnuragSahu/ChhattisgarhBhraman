package com.example.anurag.chhattisgarhbhraman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WaterFallActivity extends AppCompatActivity {

    private Button bChitekoteWF, bTirathgarh, bMendri, bAmritdhara, bChhuri, bRajpuri, bRani;
    private Button bTiger, bRakasganda , bKendai, bDevdhara, bKailash;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_fall);

        bChitekoteWF = (Button) findViewById(R.id.bChitrakoteWF);
        bTirathgarh = (Button) findViewById(R.id.bTirathgarthWF);
        bMendri = (Button) findViewById(R.id.bMendriWF);
        bAmritdhara = (Button) findViewById(R.id.bAmritdharaWF);
        bChhuri = (Button) findViewById(R.id.bChurriWF);
        bRajpuri = (Button) findViewById(R.id.bRajpuriWF);
        bRani = (Button) findViewById(R.id.bRaniWF);
        bTiger = (Button) findViewById(R.id.bTigerWF);
        bRakasganda = (Button) findViewById(R.id.bRakasgandaWF);
        bKendai = (Button) findViewById(R.id.bKendaiWF);
        //bDevdhara = (Button) findViewById(R.id.bDevdharaWF);
        bKailash = (Button) findViewById(R.id.bKailashWF);

        bChitekoteWF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WaterFallActivity.this,ChitrakoteWaterFall.class));
            }
        });
        bTirathgarh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WaterFallActivity.this,TirathgarhWaterFall.class));
            }
        });
        bMendri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WaterFallActivity.this,MendhriGhoomarWaterFall.class));
            }
        });
        bAmritdhara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WaterFallActivity.this,AmritdharaWaterFall.class));
            }
        });
        bChhuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WaterFallActivity.this,ChhuriWaterFall.class));
            }
        });
        bRajpuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WaterFallActivity.this,RajpuriWaterFall.class));
            }
        });
        bRani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WaterFallActivity.this,RaniDahWaterFall.class));
            }
        });
        bTiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WaterFallActivity.this,TigerPointWaterFall.class));
            }
        });
        bRakasganda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WaterFallActivity.this,RakasgandaWaterFall.class));
            }
        });
        bKendai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WaterFallActivity.this,KendaiWaterFall.class));
            }
        });
        bKailash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WaterFallActivity.this,KailashWaterFall.class));
            }
        });

        }
}
