package com.jonniewanathan.sudoku;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {
    private Button resetPuzzles;
    private DBHandler dbHandler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        dbHandler = new DBHandler(this);

        resetPuzzles = (Button) findViewById(R.id.reset_button);


        resetPuzzles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(SettingsActivity.this, "Puzzles have been Reset", Toast.LENGTH_SHORT).show();
                dbHandler.updatePuzzlePlayed();

            }
        });
    }
}
