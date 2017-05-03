package com.jonniewanathan.sudoku;

/**
 * Created by jonathan on 03/05/2017.
 */

public class SudokuPuzzles {

    private int id;
    private String arrayName;
    private boolean played;
    private String difficulty;
    private String sharedKey;

    public SudokuPuzzles()
    {

    }

    public SudokuPuzzles(int id, String arrayName, boolean played, String difficulty, String sharedKey) {
        this.arrayName = arrayName;
        this.played = played;
        this.difficulty = difficulty;
        this.sharedKey = sharedKey;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArrayName() {
        return arrayName;
    }

    public void setArrayName(String arrayName) {
        this.arrayName = arrayName;
    }

    public boolean isPlayed() {
        return played;
    }

    public void setPlayed(boolean played) {
        this.played = played;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getSharedKey() {
        return sharedKey;
    }

    public void setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
    }
}
