package com.jonniewanathan.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class LoadActivity extends AppCompatActivity {
    public static final String PUZZLE_KEY = "puzzleKey";
    public static final String LOAD_KEY = "loadKey";
    public static final String DIFFICULTY_KEY = "dif_key";



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
        Intent intent = this.getIntent();
        isLoad = intent.getBooleanExtra(DifficultyActivity.IS_LOAD,false);

        System.out.println("load" + isLoad);

        difficulty = intent.getStringExtra(DifficultyActivity.DIFFICULTY);

        if(!isLoad)
        {
            puzzleList = dbHandler.getAllPuzzles(difficulty);
            for (SudokuPuzzles puzzle : puzzleList) {
                puzzleNames.add(puzzle.getArrayName());
                havePlayed.add(puzzle.isPlayed());
                System.out.println(puzzle.getArrayName());
            }

        }
        else
        {
            puzzleList = dbHandler.getAllPuzzles(isLoad,difficulty);
            for (SudokuPuzzles puzzle : puzzleList) {
                puzzleNames.add(puzzle.getArrayName());
                havePlayed.add(puzzle.isPlayed());
                System.out.println(puzzle.getArrayName());
            }
        }
        System.out.println("After the if");

        ListViewAdapter listViewAdapter = new ListViewAdapter(this,puzzleNames,havePlayed,isLoad);
        list.setAdapter(listViewAdapter);



        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                TextView textView = (TextView) view;
                String text = textView.getText().toString();
                String arrayName;
                String[] key = text.split(" ");
                arrayName = key[0];
                SudokuPuzzles puzzles = dbHandler.getPuzzle(arrayName);
                System.out.println(arrayName);
                Intent intent = new Intent(LoadActivity.this,MainActivity.class);
                intent.putExtra(PUZZLE_KEY,puzzles.getSharedKey());
                intent.putExtra(LOAD_KEY,isLoad);
                intent.putExtra(DIFFICULTY_KEY,difficulty);

                if(text.contains("Played!") && !isLoad)
                {
                    Toast.makeText(LoadActivity.this, "Game has been played\nPlease select From the Load Menu", Toast.LENGTH_LONG ).show();
                }
                else
                {
                    startActivity(intent);
                }


            }
        });

    }
}
