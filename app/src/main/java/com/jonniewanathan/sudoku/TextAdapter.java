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
    private String[][] textViewPlayValues;
    private TextView[] textViews;
    private boolean[] isEditable;
    private int rowPosition;
    private int columnPosition;
    private static int count;


    public TextAdapter(Context context, int[][] sudokuValues, int[][] sudokuPlayvalues, boolean[] isEditable, TextView[] textViews) {
        this.context = context;
        this.textViews = textViews;
        this.isEditable = isEditable;
        count = 0;

        rowPosition = 0;
        columnPosition = 0;

        textViewValues = toStringArray(sudokuValues);
        textViewPlayValues = toStringArray(sudokuPlayvalues);

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;
        View gridView;

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(count < 81)
        {
            if (convertView == null)
            {
                count++;
                gridView = inflater.inflate(R.layout.text_view_temp, null);

                rowPosition = position/9;
                columnPosition = position%9;

                // set value into textview
                textView = (TextView) gridView.findViewById(R.id.sudoku);

                textView.setText(textViewPlayValues[rowPosition][columnPosition]);

                if (textViewPlayValues[rowPosition][columnPosition].equals("0"))
                {
                    isEditable[position] = true;
                    textView.setTextColor(Color.GRAY);
                    textView.setTypeface(Typeface.DEFAULT);
                }
                else if(!textViewPlayValues[rowPosition][columnPosition].equals(textViewValues[rowPosition][columnPosition]))
                {
                    isEditable[position] = true;
                    textView.setTextColor(Color.BLACK);
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

            this.textViews[position] = textView;
            System.out.println("TextView Position: " + position + " Data: " + textView.getText() + "Values: " + textViewValues[rowPosition][columnPosition] + "Play Values: " + textViewPlayValues[rowPosition][columnPosition]);
            System.out.println("Position: " + position  + " " + this.textViews[position].getText());
            System.out.println("editable: " + isEditable[position]);
            //System.out.println("position 0: " + this.textViews[0].getText());

            if(position == 0 && count == 0)
            {
                this.textViews[0] = textView;
            }
        }
        else
        {
            textView = textViews[position];
        }
        return textView;
    }

    @Override
    public int getCount() {
        return 81;
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

    private String[][] toStringArray(int[][] intArray)
    {
        String[][] values = new String[intArray.length][intArray[0].length];

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[0].length; j++) {
                values[i][j] = Integer.toString(intArray[i][j]);
            }
        }

        return values;
    }

}
