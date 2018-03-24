package com.example.anurag.chhattisgarhbhraman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Religious extends AppCompatActivity {
    private Button bDongargarh, bDhastehwari, bRatanpur, bBhoramdeoT, bLaxamT, bBursurT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious);

        bDongargarh= (Button) findViewById(R.id.bDongargarh);
        bDhastehwari  = (Button) findViewById(R.id.bDanteshwariT);
        bRatanpur = (Button) findViewById(R.id.bRantanpur);
        bBhoramdeoT = (Button) findViewById(R.id.bBhoramdeoT);
        bLaxamT = (Button) findViewById(R.id.bLaxmanT);
        bBursurT = (Button) findViewById(R.id.bBarsurT);

        bDongargarh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Religious.this,Rel1Dongarh.class));
            }
        });
        bDhastehwari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Religious.this,Rel2DhanteshwariTemple.class));
            }
        });
        bRatanpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Religious.this,Rel3Ratanpur.class));
            }
        });
        bBhoramdeoT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Religious.this,Rel4BhoramdeoT.class));
            }
        });
        bLaxamT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Religious.this,Rel5LaxmanTem.class));
            }
        });
        bBursurT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Religious.this,Rel6BursurTwinTemple.class));
            }
        });


    }
}
