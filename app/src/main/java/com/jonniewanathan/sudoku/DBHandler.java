package com.jonniewanathan.sudoku;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by jonathan on 03/05/2017.
 */

//http://mobilesiri.com/android-sqlite-database-tutorial-using-android-studio/

public class DBHandler extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION =3;
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
        String CREATE_PUZZLES_TABLE = "CREATE TABLE IF NOT EXISTS Puzzles (" +
                " Id INTEGER PRIMARY KEY, ArrayName CHAR(10), " +
                " Difficulty CHAR(1), Played CHAR(5) , SharedKey CHAR(10) )";

        System.out.println("Creating Table");

        try{
            db.execSQL(CREATE_PUZZLES_TABLE);
            System.out.println("Table Created");
        }
        catch (SQLiteException e)
        {
            Log.d("Exception",e.getMessage());
        }
    }

    public String getTableNames()
    {
        String tableName;
        String query = "SELECT name FROM " + DATABASE_NAME + ".sqlite_master WHERE type = 'table'" ;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query,null);
        cursor.moveToFirst();
        tableName = cursor.getString(0);
        cursor.close();
        db.close();
        return tableName;
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
        cursor.close();
        return puzzle;
    }

    public void updatePuzzlePlayed(String arrayName)
    {
        System.out.println("Updating: " + arrayName);
        String query = "UPDATE " + TABLE_PUZZLES + " SET " + KEY_PLAYED + " = 'true' WHERE " + KEY_ARRAY_NAME +
                " = '" + arrayName + "'";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query,null);
        cursor.moveToFirst();
        cursor.close();
    }

    public void updatePuzzlePlayed()
    {
        String query = "UPDATE " + TABLE_PUZZLES + " SET " + KEY_PLAYED + " = 'false'";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query,null);
        cursor.moveToFirst();
        cursor.close();
    }

    public SudokuPuzzles getPuzzle(String arrayName)
    {
        SudokuPuzzles puzzle = new SudokuPuzzles();;
        String query = "SELECT * FROM " + TABLE_PUZZLES + " WHERE ARRAYNAME = '" + arrayName + "'" ;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query,null);

        if(cursor.moveToFirst())
        {

            puzzle.setId(Integer.parseInt(cursor.getString(0)));
            puzzle.setArrayName(cursor.getString(1));
            puzzle.setDifficulty(cursor.getString(2));
            puzzle.setPlayed(Boolean.parseBoolean(cursor.getString(3)));
            puzzle.setSharedKey(cursor.getString(4));
        }
        cursor.close();
        return puzzle;
    }

    public String getPuzzleKey(String arrayName)
    {
        String query = "SELECT * FROM " + TABLE_PUZZLES + " WHERE ARRAYNAME = '" + arrayName + "'" ;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query,null);
        String key = "1";

        if(cursor.moveToFirst())
        {
            key = cursor.getString(4);
        }
        cursor.close();

        return key;
    }

    public int getNumberOfPuzzles()
    {
        int count;
        String countQuery = "SELECT * FROM " + TABLE_PUZZLES;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(countQuery,null);
        count = cursor.getCount();

        if(count < 1)
        {
            count = 0;
        }
        cursor.close();

        // return count
        return count;
    }

    public ArrayList<SudokuPuzzles> getAllPuzzles(String difficulty)
    {
        ArrayList<SudokuPuzzles> puzzlesList = new ArrayList<>();

        String query = "SELECT * FROM " + TABLE_PUZZLES + " WHERE " + KEY_DIFFICULTY + " = '" + difficulty + "'";
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
        return puzzlesList;
    }

    public ArrayList<SudokuPuzzles> getAllPuzzles(boolean load, String difficulty)
    {
        ArrayList<SudokuPuzzles> puzzlesList = new ArrayList<>();

        String query = "SELECT * FROM " + TABLE_PUZZLES + " WHERE " + KEY_PLAYED + " = '" + load + "' AND " +
                KEY_DIFFICULTY + " = '" + difficulty + "'";
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
        return puzzlesList;
    }

}
