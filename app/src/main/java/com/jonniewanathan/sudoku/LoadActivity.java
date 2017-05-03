package com.jonniewanathan.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LoadActivity extends AppCompatActivity {
    private String difficulty;
    private boolean isLoad;
    private DBHandler dbHandler;
    private ArrayList<SudokuPuzzles> puzzleList;
    private ArrayList<String> puzzleNames;
    private ArrayList<Boolean> havePlayed;
    private ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        puzzleList = new ArrayList<>();
        puzzleNames = new ArrayList<>();
        havePlayed = new ArrayList<>();

        list = (ListView) findViewById(R.id.load_list_view);

        dbHandler = new DBHandler(this);
        Intent intent = getIntent();
        isLoad = intent.getBooleanExtra(DifficultyActivity.IS_LOAD,false);
        System.out.println("before the if");
        if(!isLoad)
        {
            difficulty = intent.getStringExtra(DifficultyActivity.DIFFICULTY);
            puzzleList = dbHandler.getAllPuzzles();

            for (SudokuPuzzles puzzle : puzzleList) {
                puzzleNames.add(puzzle.getArrayName());
                havePlayed.add(puzzle.isPlayed());
                System.out.println(puzzle.getArrayName());
            }

        }
        else
        {
            puzzleList = dbHandler.getAllPuzzles();
            for (SudokuPuzzles puzzle : puzzleList) {
                puzzleNames.add(puzzle.getArrayName());
                havePlayed.add(puzzle.isPlayed());
                System.out.println(puzzle.getArrayName());
            }
        }
        System.out.println("After the if");

        ListViewAdapter listViewAdapter = new ListViewAdapter(this,puzzleNames,havePlayed,isLoad);
        list.setAdapter(listViewAdapter);

    }
}
