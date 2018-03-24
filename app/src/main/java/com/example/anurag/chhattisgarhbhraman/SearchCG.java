package com.example.anurag.chhattisgarhbhraman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class SearchCG extends AppCompatActivity {

    private AutoCompleteTextView actvItem;
    private Button bShow;
    private List<String> list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_cg);

        actvItem = (AutoCompleteTextView) findViewById(R.id.actvItem);
       // bShow = (Button) findViewById(R.id.bNext);

        list = new ArrayList<>();
        list.add("Android");
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("C#");
        list.add("PHP");

        adapter = new ArrayAdapter<String>(SearchCG.this,android.R.layout.select_dialog_item,list);

        actvItem.setThreshold(2);
        actvItem.setAdapter(adapter);

    }
}
