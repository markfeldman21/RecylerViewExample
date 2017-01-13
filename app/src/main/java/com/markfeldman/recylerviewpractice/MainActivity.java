package com.markfeldman.recylerviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private String[] names = {"Bruins", "Canadiens", "BlackHawks","Maple Leafs","Rangers","Red Wings"};
    private Integer[] logos = {R.drawable.bruins,R.drawable.canadiens, R.drawable.hawks,
    R.drawable.leafs,R.drawable.rangers,R.drawable.red_wings};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerViewAdapter = new RecyclerViewAdapter(names,logos);
        recyclerView.setAdapter(recyclerViewAdapter);


    }
}
