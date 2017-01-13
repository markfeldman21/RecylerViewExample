package com.markfeldman.recylerviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ListViewAdapter listViewAdapter;
    private String[] names = {"Bruins", "Canadiens", "BlackHawks","Maple Leafs","Rangers","Red Wings"};
    private Integer[] logos = {R.drawable.bruins,R.drawable.canadiens, R.drawable.hawks,
    R.drawable.leafs,R.drawable.rangers,R.drawable.red_wings};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ListView","IN MAIN");
        listView = (ListView)findViewById(R.id.listView);
        listViewAdapter = new ListViewAdapter(this,names, logos);
        listView.setAdapter(listViewAdapter);


    }
}
