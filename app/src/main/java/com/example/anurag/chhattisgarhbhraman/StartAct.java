package com.example.anurag.chhattisgarhbhraman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class StartAct extends AppCompatActivity {

    private ImageButton ibNextScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ibNextScreen = (ImageButton) findViewById(R.id.ibNextScreen);
        ibNextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartAct.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
