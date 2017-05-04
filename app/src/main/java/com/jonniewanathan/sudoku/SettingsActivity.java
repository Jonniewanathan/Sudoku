package com.jonniewanathan.sudoku;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {
    private Button resetPuzzles;
    private Switch music;
    private Switch sound;
    private Switch hint;
    private DBHandler dbHandler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        dbHandler = new DBHandler(this);

        resetPuzzles = (Button) findViewById(R.id.reset_button);
        hint = (Switch) findViewById(R.id.auto_hint);
        music = (Switch) findViewById(R.id.music);
        sound = (Switch) findViewById(R.id.sound);


        resetPuzzles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(SettingsActivity.this, "Puzzles have been Reset", Toast.LENGTH_SHORT).show();
                dbHandler.updatePuzzlePlayed();

            }
        });

        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SettingsActivity.this, "Not currently implemented", Toast.LENGTH_SHORT).show();
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SettingsActivity.this, "Not currently implemented", Toast.LENGTH_SHORT).show();
            }
        });
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SettingsActivity.this, "Not currently implemented", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
