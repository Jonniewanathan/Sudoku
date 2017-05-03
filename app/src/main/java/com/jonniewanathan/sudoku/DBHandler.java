package com.jonniewanathan.sudoku;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by jonathan on 03/05/2017.
 */

//http://mobilesiri.com/android-sqlite-database-tutorial-using-android-studio/

public class DBHandler extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION =1;
    private static final String DATABASE_NAME= "SudokuPuzzles";
    private static final String TABLE_PUZZLES = "Puzzles";
    private static final String KEY_ID = "Id";
    private static final String KEY_ARRAY_NAME = "ArrayName";
    private static final String KEY_PLAYED = "Played";
    private static final String KEY_DIFFICULTY = "Difficulty";
    private static final String KEY_SHARED_KEY = "SharedKey";





    public DBHandler(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_PUZZLES_TABLE = "CREATE TABLE " + TABLE_PUZZLES+ "("
        + KEY_ID + " INTEGER PRIMARY KEY," + KEY_ARRAY_NAME + " TEXT,"
        + KEY_DIFFICULTY + " TEXT," + KEY_PLAYED + " TEXT," + KEY_SHARED_KEY + "TEXT" + ")";
        db.execSQL(CREATE_PUZZLES_TABLE);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PUZZLES);

    }

    public void addPuzzle(SudokuPuzzles puzzle)
    {
        //Adding a Puzzle
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_ARRAY_NAME, puzzle.getArrayName());
        values.put(KEY_DIFFICULTY, puzzle.getDifficulty());
        values.put(KEY_PLAYED, puzzle.isPlayed());
        values.put(KEY_SHARED_KEY, puzzle.getSharedKey());


        //Inserting into the database
        db.insert(TABLE_PUZZLES,null,values);
        db.close();
    }

    public SudokuPuzzles getPuzzle(int id)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_PUZZLES, new String[] { KEY_ID, KEY_ARRAY_NAME,KEY_DIFFICULTY,
                KEY_PLAYED,KEY_PLAYED},KEY_ID + "=?", new String[] {String.valueOf(id)},null,null,null,null);

        if(cursor != null)
        {
            cursor.moveToFirst();
        }
            SudokuPuzzles puzzle = new SudokuPuzzles(Integer.parseInt(cursor.getString(0)),cursor.getString(1),
                    Boolean.parseBoolean(cursor.getString(2)),cursor.getString(3),cursor.getString(4));
        db.close();
        cursor.close();
        return puzzle;
    }

    public int getNumberOfPuzzles()
    {
        String query = "SELECT Count(ID) FROM " + TABLE_PUZZLES;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query,null);

        if(cursor != null)
        {
            cursor.moveToFirst();
        }

        int numberOfPuzzles = cursor.getInt(0);

        db.close();
        cursor.close();
        return numberOfPuzzles;
    }

    public ArrayList<SudokuPuzzles> getAllPuzzles()
    {
        ArrayList<SudokuPuzzles> puzzlesList = new ArrayList<>();

        String query = "SELECT * FROM " + TABLE_PUZZLES;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query,null);

        if(cursor.moveToFirst())
        {
            do{
                SudokuPuzzles puzzle = new SudokuPuzzles();
                puzzle.setId(Integer.parseInt(cursor.getString(0)));
                puzzle.setArrayName(cursor.getString(1));
                puzzle.setDifficulty(cursor.getString(2));
                puzzle.setPlayed(Boolean.parseBoolean(cursor.getString(3)));
                puzzle.setSharedKey(cursor.getString(4));

                puzzlesList.add(puzzle);
                System.out.println(puzzle.getArrayName());
            }while(cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return puzzlesList;
    }

}
