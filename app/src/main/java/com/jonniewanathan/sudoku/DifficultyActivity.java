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

    boolean load;

    public static final String DIFFICULTY = "difficulty";
    public static final String IS_LOAD = "dif_loadKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);
        Intent intent = this.getIntent();
        load = intent.getBooleanExtra(MainMenu.LOAD_KEY,false);
        System.out.println("difficulty" + load);

        easy = (Button) findViewById(R.id.easy);
        medium = (Button) findViewById(R.id.medium);
        hard = (Button) findViewById(R.id.hard);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DifficultyActivity.this,LoadActivity.class);
                intent.putExtra(DIFFICULTY,"E");
                intent.putExtra(IS_LOAD,load);

                startActivity(intent);
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DifficultyActivity.this,LoadActivity.class);
                intent.putExtra(DIFFICULTY,"M");
                intent.putExtra(IS_LOAD,load);

                startActivity(intent);
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DifficultyActivity.this,LoadActivity.class);
                intent.putExtra(DIFFICULTY,"H");
                intent.putExtra(IS_LOAD,load);

                startActivity(intent);
            }
        });

    }
}
