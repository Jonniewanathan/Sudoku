package com.jonniewanathan.sudoku;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQuery;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by jonathan on 03/05/2017.
 */

//http://mobilesiri.com/android-sqlite-database-tutorial-using-android-studio/

public class DBHandler extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION =2;
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




    }

    public void createTable()
    {
        SQLiteDatabase db = this.getWritableDatabase();

        String CREATE_PUZZLES_TABLE = "CREATE TABLE IF NOT EXISTS Puzzles (" +
                " Id INTEGER PRIMARY KEY, ArrayName CHAR(10), " +
                " Difficulty CHAR(1), Played CHAR(5) , SharedKey CHAR(10) )";

        System.out.println("Creating Table");

        try{
            db.execSQL(CREATE_PUZZLES_TABLE);
            System.out.println("Table Created");
            db.close();
        }
        catch (SQLiteException e)
        {
            Log.d("Exception",e.getMessage());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PUZZLES);

    }

    public void addPuzzle(SudokuPuzzles puzzle)
    {
        //Adding a Puzzle
        SQLiteDatabase db = this.getWritableDatabase();

        String query = "INSERT INTO " + TABLE_PUZZLES +" ( "+ KEY_ID + " , " + KEY_ARRAY_NAME  + " , " + KEY_DIFFICULTY +
                ", " + KEY_PLAYED + " , " + KEY_SHARED_KEY + " )" +
                " VALUES ( " + puzzle.getId() + ", '" + puzzle.getArrayName() + "', '" + puzzle.getDifficulty() +  "' , '" +
                puzzle.isPlayed() + "' , '" + puzzle.getSharedKey() + "' )";


        db.execSQL(query);
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
        int count;
        String countQuery = "SELECT * FROM " + TABLE_PUZZLES + " ORDER BY ID";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        count = cursor.getCount();

        cursor.close();

        // return count
        return count;
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
