package com.example.anurag.chhattisgarhbhraman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bNationalPark,bWaterFalls,bMonuments, bReligions,bWildLife, bHills, bTribes;
    private Button bMuseums, bCaves, bDam, bTiger, bArt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bNationalPark = (Button) findViewById(R.id.bNationalPark);
        bWaterFalls = (Button) findViewById(R.id.bWaterFalls);
        //bMonuments = (Button) findViewById(R.id.bMonuments);
        bReligions = (Button) findViewById(R.id.bReligions);
        bWildLife = (Button) findViewById(R.id.bWildlife);
        bHills = (Button) findViewById(R.id.bHills);
        bTribes = (Button) findViewById(R.id.bTribes);
        bMuseums = (Button) findViewById(R.id.bMuseums);
        bCaves = (Button) findViewById(R.id.bCaves);
        bDam = (Button) findViewById(R.id.bDam);
        bTiger = (Button) findViewById(R.id.bTiger);
        bArt = (Button) findViewById(R.id.bArt);

        bNationalPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NationalParkActivity.class);
                startActivity(intent);
            }
        });

        bWaterFalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,WaterFallActivity.class);
                startActivity(intent);
            }
        });

        bReligions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Religious.class);
                startActivity(intent);
            }
        });





    }
}
