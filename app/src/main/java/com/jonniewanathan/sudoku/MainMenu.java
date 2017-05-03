package com.jonniewanathan.sudoku;

import android.content.Intent;
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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        dbHandler = new DBHandler(this);

        dbHandler.createTable();

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
        }
        Log.d("Reading: ", "Reading all Puzzles..");

        ArrayList<SudokuPuzzles> puzzles = dbHandler.getAllPuzzles();

        for (SudokuPuzzles puzzleTest: puzzles) {
            Log.d("Reading",puzzleTest.getArrayName());
        }


        newGame = (Button) findViewById(R.id.new_game);
        loadGame = (Button) findViewById(R.id.load_game);
        settings = (Button) findViewById(R.id.settings);


        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, MainActivity.class);
                startActivity(intent);

            }
        });

        loadGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, DifficultyActivity.class);
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
