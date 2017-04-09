package com.jonniewanathan.sudoku;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by jonathan on 02/04/2017.
 */

public class TextAdapter extends BaseAdapter {

    private Context context;
    private String[][] textViewValues;
    private TextView[] textViews;
    private boolean[] isEditable;
    private int rowPosition;
    private int columnPosition;


    public TextAdapter(Context context, int[][] sudokuValues, boolean[] isEditable,TextView[] textViews) {
        this.context = context;
        this.textViews = textViews;
        this.isEditable = isEditable;

        rowPosition = 0;
        columnPosition = 0;

        textViewValues = new String[sudokuValues.length][sudokuValues[0].length];

        for (int i = 0; i < sudokuValues.length; i++) {
            for (int j = 0; j < sudokuValues[0].length; j++) {
                textViewValues[i][j] = Integer.toString(sudokuValues[i][j]);
            }
        }

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;
        View gridView;

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null)
        {
            gridView = inflater.inflate(R.layout.text_view_temp, null);

            rowPosition = position/9;
            columnPosition = position%9;

            // set value into textview
            textView = (TextView) gridView.findViewById(R.id.sudoku);

            textView.setText(textViewValues[rowPosition][columnPosition]);

            if (textViewValues[rowPosition][columnPosition].equals("0"))
            {
                isEditable[position] = true;
                textView.setTextColor(Color.GRAY);
                textView.setTypeface(Typeface.DEFAULT);
            }
            else
            {
                isEditable[position] = false;
                textView.setTextColor(Color.BLACK);
                textView.setTypeface(Typeface.DEFAULT_BOLD);
            }
            textView.setBackgroundColor(Color.GRAY);
        }
        else
        {
            textView = (TextView) convertView;
        }

        System.out.println("Position: " + position);

        this.textViews[position] = textView;
        System.out.println(this.textViews[position].getText());

        System.out.println("position 0: " + this.textViews[0].getText());
        return textView;
    }

    @Override
    public int getCount() {
        return (textViewValues.length*textViewValues[0].length);
    }

    @Override
    public TextView getItem(int position) {
        return textViews[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public TextView[] getTextViews()
    {
        return this.textViews;
    }


}
