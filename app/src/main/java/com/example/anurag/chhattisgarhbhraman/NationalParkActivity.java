package com.example.anurag.chhattisgarhbhraman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NationalParkActivity extends AppCompatActivity {

    private Button bGuruGhasiDasNP, bKangerValleyNp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national_park);

        bGuruGhasiDasNP = (Button) findViewById(R.id.bGuruGhasiDasNP);
        bKangerValleyNp = (Button) findViewById(R.id.bKangerValleyNP);

        bGuruGhasiDasNP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NationalParkActivity.this,GuruGhasiDasNPActivity.class);
                startActivity(intent);
            }
        });

        bKangerValleyNp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NationalParkActivity.this,KangerValleyNP.class);
                startActivity(intent);
            }
        });
    }
}
