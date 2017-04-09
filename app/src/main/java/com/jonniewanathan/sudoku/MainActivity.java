package com.jonniewanathan.sudoku;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[][] sudokuInt;
    int[][] sudokuIntRemoved;
    int[][] sudokuPlayArray;
    int row = 9;
    int column = 9;
    int position;
    int playRow;
    int playColumn;

    GridView sudokuBoard;

    TextAdapter textAdapter;

    TextView textView;
    TextView lastView;
    TextView currentlySelected;
    TextView[] textViews;

    boolean selected;
    boolean[] isEditable;

    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sudokuInt = new int[row][column];
        sudokuIntRemoved = new int[row][column];
        sudokuPlayArray = new int[row][column];

        isEditable = new boolean[81];

//        SudokuUtility.fillSudokuBoard(sudokuInt);
//
//        sudokuIntRemoved = sudokuInt.clone();
//
//        SudokuUtility.removeNumbersPlayboard(sudokuIntRemoved);

        sudokuInt = EasyPuzzles.fullEasy2.clone();
        sudokuIntRemoved = EasyPuzzles.easy2.clone();

        sudokuBoard = (GridView) findViewById(R.id.sudokuBoard);

        sudokuPlayArray = sudokuIntRemoved.clone();

        textAdapter = new TextAdapter(this,sudokuIntRemoved,isEditable,textViews);

        sudokuBoard.setAdapter(textAdapter);
        sudokuBoard.setBackgroundColor(Color.DKGRAY);

        //textViews = textAdapter.getTextViews();


        one = (Button) findViewById(R.id.button);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button4);
        five = (Button) findViewById(R.id.button5);
        six = (Button) findViewById(R.id.button6);
        seven = (Button) findViewById(R.id.button7);
        eight = (Button) findViewById(R.id.button8);
        nine = (Button) findViewById(R.id.button9);
        x = (Button) findViewById(R.id.button10);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(currentlySelected != null && isEditable[position])
                {
                    currentlySelected.setText("1");
                    playColumn = position%9;
                    playRow = position/9;
                    sudokuPlayArray[playRow][playColumn] = 1;
                    currentlySelected.setTextColor(Color.BLACK);
                }

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentlySelected != null && isEditable[position])
                {
                    currentlySelected.setText("2");
                    playColumn = position % 9;
                    playRow = position / 9;
                    sudokuPlayArray[playRow][playColumn] = 2;
                    currentlySelected.setTextColor(Color.BLACK);
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentlySelected != null && isEditable[position])
                {
                    currentlySelected.setText("3");
                    playColumn = position % 9;
                    playRow = position / 9;
                    sudokuPlayArray[playRow][playColumn] = 3;
                    currentlySelected.setTextColor(Color.BLACK);
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentlySelected != null && isEditable[position])
                {
                    currentlySelected.setText("4");
                    playColumn = position % 9;
                    playRow = position / 9;
                    sudokuPlayArray[playRow][playColumn] = 4;
                    currentlySelected.setTextColor(Color.BLACK);
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentlySelected != null && isEditable[position])
                {
                    currentlySelected.setText("5");
                    playColumn = position % 9;
                    playRow = position / 9;
                    sudokuPlayArray[playRow][playColumn] = 5;
                    currentlySelected.setTextColor(Color.BLACK);
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentlySelected != null && isEditable[position])
                {
                    currentlySelected.setText("6");
                    playColumn = position % 9;
                    playRow = position / 9;
                    sudokuPlayArray[playRow][playColumn] = 6;
                    currentlySelected.setTextColor(Color.BLACK);
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentlySelected != null && isEditable[position])
                {
                    currentlySelected.setText("7");
                    playColumn = position % 9;
                    playRow = position / 9;
                    sudokuPlayArray[playRow][playColumn] = 7;
                    currentlySelected.setTextColor(Color.BLACK);
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentlySelected != null && isEditable[position])
                {
                    currentlySelected.setText("8");
                    playColumn = position % 9;
                    playRow = position / 9;
                    sudokuPlayArray[playRow][playColumn] = 8;
                    currentlySelected.setTextColor(Color.BLACK);
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentlySelected != null && isEditable[position])
                {
                    currentlySelected.setText("9");
                    playColumn = position % 9;
                    playRow = position / 9;
                    sudokuPlayArray[playRow][playColumn] = 9;
                    currentlySelected.setTextColor(Color.BLACK);
                }
            }
        });

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentlySelected != null && isEditable[position])
                {
                    currentlySelected.setText("0");
                    playColumn = position % 9;
                    playRow = position / 9;
                    sudokuPlayArray[playRow][playColumn] = 0;
                    currentlySelected.setTextColor(Color.BLUE);
                }
            }
        });

        sudokuBoard.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                position = i;

                System.out.println(position);

                unHighlight();

                highLightRows(position);
                highLightColumns(position);

                textView = (TextView) view;

                if(lastView == textView)
                {
                    selected = false;
                    currentlySelected = null;
                }
                else
                {
                    selected = true;
                    currentlySelected = textView;
                }

                if(!selected)
                {
                    textView.setBackgroundColor(Color.GRAY);
                    textView.setTextColor(Color.BLACK);
                    unHighlight();
                    if(textView.getText().equals("0"))
                    {
                        textView.setTextColor(Color.GRAY);
                    }
                    else
                    {
                        textView.setTextColor(Color.BLACK);
                    }
                    lastView = null;
                }
                else
                {

                    if(lastView != null)
                    {
                        lastView.setBackgroundColor(Color.GRAY);

                        if(lastView.getText().equals("0"))
                        {
                            lastView.setTextColor(Color.GRAY);
                        }
                        else
                        {
                            lastView.setTextColor(Color.BLACK);
                        }

                    }
                    lastView = textView;

                    highLightRows(position);
                    highLightColumns(position);

                    if (textView.getText().equals("0"))
                    {
                        textView.setTextColor(Color.BLUE);
                    }

                    view.setBackgroundColor(Color.BLUE);
                }


            }
        });
    }

    public void highLightRows(int position)
    {
        int start = 0;
        int end = 0;

        int num = position/9;

        start = num*9;
        end = start+8;

        if(position >= start && position <= end)
        {
            for (int i = start; i < (end+1); i++) {

                textViews[i].setBackgroundColor(Color.CYAN);
                if(textViews[i].getText().equals("0"))
                {
                    textViews[i].setTextColor(Color.CYAN);
                }

            }
        }
    }

    public void highLightColumns(int position)
    {
        int start = 0;
        int end = 0;

        start = position%9;
        end = start+72;

        if(position >= start && position <= end)
        {
            for (int i = start; i < (end+1); i += 9) {

                textViews[i].setBackgroundColor(Color.CYAN);
                if(textViews[i].getText().equals("0"))
                {
                    textViews[i].setTextColor(Color.CYAN);
                }

            }
        }
    }

    public void unHighlight()
    {
        for (int i = 0; i < textViews.length; i++) {

            textViews[i].setBackgroundColor(Color.GRAY);
            if(textViews[i].getText().equals("0"))
            {
                textViews[i].setTextColor(Color.GRAY);
            }

        }
    }

}
