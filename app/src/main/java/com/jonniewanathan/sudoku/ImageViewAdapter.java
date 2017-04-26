package com.jonniewanathan.sudoku;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by jonathan on 18/04/2017.
 */

public class ImageViewAdapter extends BaseAdapter {

    private Context mContext;
    private int[] values;

    public ImageViewAdapter(Context c, int[][] values){
        mContext = c;
        this.values = new int[81];
        int count = 0;

        for (int i = 0; i < values.length ; i++) {
            for (int j = 0; j < values[0].length; j++) {
                this.values[count] = values[i][j];
                count++;
            }
        }
    }

    public int getCount() {
        return this.values.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[values[position]]);

        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.number0, R.drawable.number1,
            R.drawable.number2, R.drawable.number3,
            R.drawable.number4, R.drawable.number5,
            R.drawable.number6, R.drawable.number7,
            R.drawable.number8, R.drawable.number9};
}
