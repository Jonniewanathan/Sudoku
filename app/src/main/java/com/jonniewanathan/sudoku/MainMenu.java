package com.jonniewanathan.sudoku;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainMenu extends AppCompatActivity {

    Button newGame;
    Button loadGame;
    Button settings;
    DBHandler dbHandler;

    SharedPreferences sudokuSave;

    public static final String PREF_KEY = "Pref_key";
    public static final String LOAD_KEY = "Load_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        sudokuSave = getSharedPreferences(PREF_KEY,Context.MODE_PRIVATE);

        try{
            dbHandler = new DBHandler(this);

            Log.d("Insert: ", "Inserting ..");

            int numPuzzles = dbHandler.getNumberOfPuzzles();

            Log.d("number of puzzles", ""+numPuzzles);

            if(numPuzzles == 0)
            {
                for (int i = 1; i < 51; i++)
                {
                    SudokuPuzzles puzzle = new SudokuPuzzles(i,"easy" + i,false,"E","EASY" + i);
                    dbHandler.addPuzzle(puzzle);
                }
                for (int i = 51; i < 102; i++)
                {
                    SudokuPuzzles puzzle = new SudokuPuzzles(i,"medium" + (i-50),false,"M","MEDIUM" + (i-50));
                    dbHandler.addPuzzle(puzzle);
                }
                for (int i = 102; i < 153; i++)
                {
                    SudokuPuzzles puzzle = new SudokuPuzzles(i,"hard" + (i-101),false,"H","HARD" + (i-101));
                    dbHandler.addPuzzle(puzzle);
                }
            }
        }
        catch(SQLiteException e)
        {
            Log.d("ERROR!","Database Error");
        }


        newGame = (Button) findViewById(R.id.new_game);
        loadGame = (Button) findViewById(R.id.load_game);
        settings = (Button) findViewById(R.id.settings);


        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, DifficultyActivity.class);
                intent.putExtra(LOAD_KEY,false);
                startActivity(intent);
            }
        });

        loadGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, DifficultyActivity.class);
                intent.putExtra(LOAD_KEY,true);
                startActivity(intent);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }


}
