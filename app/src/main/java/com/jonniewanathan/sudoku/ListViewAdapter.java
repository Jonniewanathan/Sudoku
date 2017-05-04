package com.jonniewanathan.sudoku;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by jonathan on 03/05/2017.
 */



public class ListViewAdapter extends ArrayAdapter<String> {

    private Context context;
    private ArrayList<String> list;
    private ArrayList<Boolean> played;
    private boolean load;

    public ListViewAdapter(Context context, ArrayList<String> list, ArrayList<Boolean> played, boolean load) {
        super(context, 0, list);
        this.context = super.getContext();
        this.list = list;
        this.played = played;
        this.load = load;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TextView textView;
        View listView;

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        System.out.println(list.get(position));

        if (convertView == null) {
            listView = inflater.inflate(R.layout.text_view_temp, null);

            // set value into textview
            textView = (TextView) listView.findViewById(R.id.load_puzzle_list);

            textView.setText(list.get(position));
        }
        else
        {
            textView = (TextView) convertView;
        }
        if(played.get(position))
        {
            String text = list.get(position) + " Played!";
            textView.setText(text);
        }
        else
        {
            textView.setText(list.get(position));
        }


        return textView;
    }

    @Override
    public int getCount() {
        return list.size();
    }
}

