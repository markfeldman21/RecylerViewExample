package com.markfeldman.recylerviewpractice;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by markfeldman on 1/13/17.
 */

public class ListViewAdapter extends BaseAdapter {
    private Context context;
    private String[] names;
    private Integer[] logos;
    private TextView nameWidget;
    private ImageView logoWidget;


    public ListViewAdapter(Context c, String[] names, Integer[] logos){
        Log.d("ListView","IN LISTVIEW CONSTRUCTOR");
        this.context = c;
        this.names = names;
        this.logos = logos;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Log.d("ListView","IN LISTVIEW");
        View row = view;

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.individual_team_view, null);

        nameWidget = (TextView)row.findViewById(R.id.teamName);
        logoWidget = (ImageView)row.findViewById(R.id.teamLogo);

        nameWidget.setText(names[i]);
        logoWidget.setImageResource(logos[i]);


        return row;
    }

}
