package com.jonniewanathan.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DifficultyActivity extends AppCompatActivity {

    Button easy;
    Button medium;
    Button hard;

    public static final String DIFFICULTY = "difficulty";
    public static final String IS_LOAD = "loadKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        easy = (Button) findViewById(R.id.easy);
        medium = (Button) findViewById(R.id.medium);
        hard = (Button) findViewById(R.id.hard);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DifficultyActivity.this,LoadActivity.class);
                intent.putExtra(DIFFICULTY,"easy");
                intent.putExtra(IS_LOAD,false);

                startActivity(intent);
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DifficultyActivity.this,LoadActivity.class);
                intent.putExtra(DIFFICULTY,"medium");
                intent.putExtra(IS_LOAD,false);

                startActivity(intent);
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DifficultyActivity.this,LoadActivity.class);
                intent.putExtra(DIFFICULTY,"hard");
                intent.putExtra(IS_LOAD,false);

                startActivity(intent);
            }
        });

    }
}
