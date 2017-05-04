package com.jonniewanathan.sudoku;

import java.util.HashMap;

/**
 * Created by jonathan on 07/04/2017.
 */

public class EasyPuzzles {


    private HashMap<String,int[][]> puzzles = new HashMap<>();
    private HashMap<String,int[][]> fullPuzzles = new HashMap<>();

    public EasyPuzzles() {
        this.populatePuzzles();
    }

    public void populatePuzzles()
    {
        this.addPuzzles("easy1",easy1);
        this.addPuzzles("easy2",easy2);
        this.addPuzzles("easy3",easy3);
        this.addPuzzles("easy4",easy4);
        this.addPuzzles("easy5",easy5);
        this.addPuzzles("easy6",easy6);
        this.addPuzzles("easy7",easy7);
        this.addPuzzles("easy8",easy8);
        this.addPuzzles("easy9",easy9);
        this.addPuzzles("easy10",easy10);
        this.addPuzzles("easy11",easy11);
        this.addPuzzles("easy12",easy12);
        this.addPuzzles("easy13",easy13);
        this.addPuzzles("easy14",easy14);
        this.addPuzzles("easy15",easy15);
        this.addPuzzles("easy16",easy16);
        this.addPuzzles("easy17",easy17);
        this.addPuzzles("easy18",easy18);
        this.addPuzzles("easy19",easy19);
        this.addPuzzles("easy20",easy20);
        this.addPuzzles("easy21",easy21);
        this.addPuzzles("easy22",easy22);
        this.addPuzzles("easy23",easy23);
        this.addPuzzles("easy24",easy24);
        this.addPuzzles("easy25",easy25);
        this.addPuzzles("easy26",easy26);
        this.addPuzzles("easy27",easy27);
        this.addPuzzles("easy28",easy28);
        this.addPuzzles("easy29",easy29);
        this.addPuzzles("easy30",easy30);
        this.addPuzzles("easy31",easy31);
        this.addPuzzles("easy32",easy32);
        this.addPuzzles("easy33",easy33);
        this.addPuzzles("easy34",easy34);
        this.addPuzzles("easy35",easy35);
        this.addPuzzles("easy36",easy36);
        this.addPuzzles("easy37",easy37);
        this.addPuzzles("easy38",easy38);
        this.addPuzzles("easy39",easy39);
        this.addPuzzles("easy40",easy40);
        this.addPuzzles("easy41",easy41);
        this.addPuzzles("easy42",easy42);
        this.addPuzzles("easy43",easy43);
        this.addPuzzles("easy44",easy44);
        this.addPuzzles("easy45",easy45);
        this.addPuzzles("easy46",easy46);
        this.addPuzzles("easy47",easy47);
        this.addPuzzles("easy48",easy48);
        this.addPuzzles("easy49",easy49);
        this.addPuzzles("easy50",easy50);
        this.addFullPuzzles("easy1",fullEasy1);
        this.addFullPuzzles("easy2",fullEasy2);
        this.addFullPuzzles("easy3",fullEasy3);
        this.addFullPuzzles("easy4",fullEasy4);
        this.addFullPuzzles("easy5",fullEasy5);
        this.addFullPuzzles("easy6",fullEasy6);
        this.addFullPuzzles("easy7",fullEasy7);
        this.addFullPuzzles("easy8",fullEasy8);
        this.addFullPuzzles("easy9",fullEasy9);
        this.addFullPuzzles("easy10",fullEasy10);
        this.addFullPuzzles("easy11",fullEasy11);
        this.addFullPuzzles("easy12",fullEasy12);
        this.addFullPuzzles("easy13",fullEasy13);
        this.addFullPuzzles("easy14",fullEasy14);
        this.addFullPuzzles("easy15",fullEasy15);
        this.addFullPuzzles("easy16",fullEasy16);
        this.addFullPuzzles("easy17",fullEasy17);
        this.addFullPuzzles("easy18",fullEasy18);
        this.addFullPuzzles("easy19",fullEasy19);
        this.addFullPuzzles("easy20",fullEasy20);
        this.addFullPuzzles("easy21",fullEasy21);
        this.addFullPuzzles("easy22",fullEasy22);
        this.addFullPuzzles("easy23",fullEasy23);
        this.addFullPuzzles("easy24",fullEasy24);
        this.addFullPuzzles("easy25",fullEasy25);
        this.addFullPuzzles("easy26",fullEasy26);
        this.addFullPuzzles("easy27",fullEasy27);
        this.addFullPuzzles("easy28",fullEasy28);
        this.addFullPuzzles("easy29",fullEasy29);
        this.addFullPuzzles("easy30",fullEasy30);
        this.addFullPuzzles("easy31",fullEasy31);
        this.addFullPuzzles("easy32",fullEasy32);
        this.addFullPuzzles("easy33",fullEasy33);
        this.addFullPuzzles("easy34",fullEasy34);
        this.addFullPuzzles("easy35",fullEasy35);
        this.addFullPuzzles("easy36",fullEasy36);
        this.addFullPuzzles("easy37",fullEasy37);
        this.addFullPuzzles("easy38",fullEasy38);
        this.addFullPuzzles("easy39",fullEasy39);
        this.addFullPuzzles("easy40",fullEasy40);
        this.addFullPuzzles("easy41",fullEasy41);
        this.addFullPuzzles("easy42",fullEasy42);
        this.addFullPuzzles("easy43",fullEasy43);
        this.addFullPuzzles("easy44",fullEasy44);
        this.addFullPuzzles("easy45",fullEasy45);
        this.addFullPuzzles("easy46",fullEasy46);
        this.addFullPuzzles("easy47",fullEasy47);
        this.addFullPuzzles("easy48",fullEasy48);
        this.addFullPuzzles("easy49",fullEasy49);
        this.addFullPuzzles("easy50",fullEasy50);
    }


    public void addPuzzles(String arrayName, int[][] puzzle)
    {
        puzzles.put(arrayName,puzzle);
    }
    public void addFullPuzzles(String arrayName, int[][] puzzle)
    {
        fullPuzzles.put(arrayName,puzzle);
    }

    public int[][] getPuzzle(String key)
    {
        return puzzles.get(key);
    }

    public int[][] getFullPuzzle(String key)
    {
        return fullPuzzles.get(key);
    }

    public HashMap<String, int[][]> getPuzzles() {
        return puzzles;
    }

    private int[][] fullEasy1 = {
            {8,3,9,6,2,1,4,5,7,},
            {5,2,6,4,7,9,3,1,8,},
            {1,4,7,8,5,3,2,6,9,},
            {2,1,8,9,3,7,5,4,6,},
            {9,6,5,2,1,4,7,8,3,},
            {3,7,4,5,8,6,9,2,1,},
            {6,9,2,3,4,8,1,7,5,},
            {7,5,3,1,6,2,8,9,4,},
            {4,8,1,7,9,5,6,3,2,}
    };


    private int[][] easy1 = {
            {0,0,0,6,2,1,4,5,7,},
            {5,2,6,4,7,9,3,1,8,},
            {1,4,7,8,5,3,2,6,9,},
            {2,1,8,9,3,7,5,4,6,},
            {9,6,5,2,1,4,7,8,3,},
            {3,7,4,5,8,6,9,2,1,},
            {6,9,2,3,4,8,1,7,5,},
            {7,5,3,1,6,2,8,9,4,},
            {4,8,1,7,9,5,6,3,2,}
    };


    private int[][] fullEasy2 = {
            {1,4,2,3,9,8,5,7,6,},
            {7,3,5,6,4,1,9,2,8,},
            {8,6,9,7,5,2,3,4,1,},
            {2,5,3,1,8,7,6,9,4,},
            {4,8,7,9,2,6,1,3,5,},
            {9,1,6,4,3,5,2,8,7,},
            {6,2,1,8,7,9,4,5,3,},
            {5,7,4,2,1,3,8,6,9,},
            {3,9,8,5,6,4,7,1,2,}
    };


    private int[][] easy2 = {
            {1,4,0,3,0,8,5,0,6,},
            {7,0,5,6,0,1,9,2,0,},
            {8,6,9,7,5,0,3,0,1,},
            {0,0,3,0,0,7,6,0,4,},
            {4,0,7,9,2,6,0,3,0,},
            {9,1,6,4,3,0,2,8,7,},
            {6,2,1,8,7,9,4,5,3,},
            {5,7,4,2,0,3,0,6,0,},
            {0,0,0,0,6,4,7,1,2,}
    };


    private int[][] fullEasy3 = {
            {6,5,1,4,2,9,8,7,3,},
            {3,4,7,8,6,1,5,9,2,},
            {9,8,2,7,3,5,1,6,4,},
            {7,1,3,2,4,6,9,5,8,},
            {4,6,5,9,8,7,2,3,1,},
            {8,2,9,5,1,3,7,4,6,},
            {1,9,4,6,5,8,3,2,7,},
            {5,3,6,1,7,2,4,8,9,},
            {2,7,8,3,9,4,6,1,5,}
    };


    int[][] easy3 = {
            {6,0,0,4,0,9,0,7,3,},
            {3,4,7,8,0,0,5,0,2,},
            {9,0,2,7,3,5,1,6,0,},
            {7,1,3,0,4,6,9,0,8,},
            {4,0,0,9,8,7,2,3,1,},
            {8,0,9,0,1,3,7,0,0,},
            {0,0,0,6,0,8,3,2,7,},
            {5,3,6,1,7,0,4,8,0,},
            {2,7,8,3,9,4,6,0,5,}
    };


    int[][] fullEasy4 = {
            {6,5,4,2,8,9,1,3,7,},
            {8,1,2,7,5,3,6,9,4,},
            {3,9,7,4,1,6,2,8,5,},
            {5,7,9,3,6,2,4,1,8,},
            {2,4,8,1,7,5,9,6,3,},
            {1,6,3,8,9,4,5,7,2,},
            {7,8,5,9,4,1,3,2,6,},
            {4,2,1,6,3,7,8,5,9,},
            {9,3,6,5,2,8,7,4,1,}
    };


    int[][] easy4 = {
            {6,5,4,2,8,9,0,3,7,},
            {0,1,0,0,5,0,0,9,4,},
            {3,0,7,0,1,6,2,0,5,},
            {5,7,0,3,0,2,4,1,8,},
            {2,4,0,1,7,5,0,0,0,},
            {1,6,0,0,9,0,5,7,2,},
            {7,0,5,9,4,1,3,0,6,},
            {0,2,1,6,0,0,8,5,9,},
            {9,3,6,5,2,0,7,0,0,}
    };


    int[][] fullEasy5 = {
            {6,3,8,5,9,4,1,7,2,},
            {5,4,1,7,6,2,9,8,3,},
            {2,7,9,1,3,8,5,6,4,},
            {8,6,3,4,2,5,7,1,9,},
            {4,1,5,9,7,3,8,2,6,},
            {9,2,7,6,8,1,4,3,5,},
            {1,9,6,2,4,7,3,5,8,},
            {7,8,2,3,5,9,6,4,1,},
            {3,5,4,8,1,6,2,9,7,}
    };


    int[][] easy5 = {
            {6,3,8,5,9,0,1,0,2,},
            {5,4,0,7,6,0,0,8,3,},
            {2,7,0,1,0,8,5,0,4,},
            {8,0,3,4,2,5,0,0,9,},
            {4,1,5,9,7,3,8,0,6,},
            {0,0,7,0,0,1,4,3,5,},
            {0,9,6,2,4,7,3,5,8,},
            {0,8,2,0,5,9,0,4,1,},
            {3,5,4,0,1,6,2,0,0,}
    };


    int[][] fullEasy6 = {
            {8,5,7,2,1,4,3,9,6,},
            {4,6,3,8,9,5,2,1,7,},
            {1,2,9,7,6,3,5,4,8,},
            {2,4,8,5,3,9,7,6,1,},
            {5,3,1,4,7,6,8,2,9,},
            {9,7,6,1,8,2,4,5,3,},
            {6,8,5,3,4,1,9,7,2,},
            {3,9,2,6,5,7,1,8,4,},
            {7,1,4,9,2,8,6,3,5,}
    };


    int[][] easy6 = {
            {8,0,7,2,1,4,3,0,6,},
            {4,0,3,0,9,5,2,1,0,},
            {1,2,9,7,0,3,0,4,8,},
            {2,4,8,5,3,9,0,6,1,},
            {0,0,1,4,7,0,8,2,9,},
            {9,0,6,0,8,0,0,5,3,},
            {6,8,0,3,4,0,9,0,0,},
            {3,9,2,6,5,0,1,8,4,},
            {0,0,4,9,2,8,6,0,5,}
    };


    int[][] fullEasy7 = {
            {5,1,3,4,8,7,9,6,2,},
            {9,2,8,1,6,5,4,7,3,},
            {7,6,4,3,9,2,8,5,1,},
            {8,4,6,9,2,3,7,1,5,},
            {3,7,1,5,4,8,2,9,6,},
            {2,5,9,6,7,1,3,4,8,},
            {1,9,5,8,3,4,6,2,7,},
            {6,3,7,2,1,9,5,8,4,},
            {4,8,2,7,5,6,1,3,9,}
    };


    int[][] easy7 = {
            {0,0,3,4,8,7,9,0,2,},
            {9,2,8,1,0,0,4,0,3,},
            {7,6,4,3,9,2,8,5,1,},
            {0,4,6,0,2,3,7,1,5,},
            {3,7,1,5,4,8,0,9,6,},
            {2,0,9,6,0,1,3,0,8,},
            {0,9,5,0,3,0,6,2,0,},
            {6,3,7,2,1,9,5,8,0,},
            {4,0,2,7,0,6,1,3,9,}
    };


    int[][] fullEasy8 = {
            {5,6,2,1,7,8,4,9,3,},
            {1,3,7,4,2,9,6,8,5,},
            {4,8,9,5,3,6,1,7,2,},
            {6,9,3,2,4,1,8,5,7,},
            {8,1,5,6,9,7,3,2,4,},
            {2,7,4,3,8,5,9,1,6,},
            {3,4,8,7,1,2,5,6,9,},
            {9,2,6,8,5,3,7,4,1,},
            {7,5,1,9,6,4,2,3,8,}
    };


    int[][] easy8 = {
            {5,6,2,1,7,8,4,9,3,},
            {1,3,0,0,0,9,6,0,5,},
            {4,8,0,5,3,6,1,0,2,},
            {6,0,3,0,4,1,8,5,7,},
            {8,1,0,6,9,7,3,0,0,},
            {2,7,0,3,0,5,9,1,0,},
            {3,4,8,0,1,2,5,6,9,},
            {0,2,6,8,5,3,7,4,1,},
            {0,5,1,0,6,0,2,0,0,}
    };


    int[][] fullEasy9 = {
            {3,5,4,9,1,2,8,7,6,},
            {6,9,8,4,7,5,2,3,1,},
            {2,7,1,3,6,8,9,4,5,},
            {1,3,5,6,8,4,7,2,9,},
            {4,8,2,7,9,1,5,6,3,},
            {9,6,7,5,2,3,1,8,4,},
            {5,4,9,8,3,7,6,1,2,},
            {8,1,3,2,5,6,4,9,7,},
            {7,2,6,1,4,9,3,5,8,}
    };


    int[][] easy9 = {
            {3,0,4,0,1,2,8,7,6,},
            {6,9,0,0,7,0,0,3,0,},
            {2,0,1,3,6,8,9,4,5,},
            {1,0,5,0,0,4,7,0,9,},
            {4,8,2,7,9,1,5,0,3,},
            {0,6,7,5,2,0,1,8,0,},
            {0,4,9,0,3,0,6,1,2,},
            {8,1,3,2,5,6,4,0,0,},
            {7,2,0,0,4,9,3,5,8,}
    };


    int[][] fullEasy10 = {
            {9,7,3,4,6,5,1,2,8,},
            {8,4,1,9,2,7,5,3,6,},
            {6,2,5,8,3,1,4,7,9,},
            {5,8,2,7,9,4,6,1,3,},
            {7,3,9,1,8,6,2,4,5,},
            {1,6,4,2,5,3,9,8,7,},
            {4,9,8,5,7,2,3,6,1,},
            {3,1,7,6,4,9,8,5,2,},
            {2,5,6,3,1,8,7,9,4,}
    };


    int[][] easy10 = {
            {9,7,3,0,0,5,0,2,8,},
            {0,4,1,9,0,7,5,3,0,},
            {6,0,5,8,3,1,4,7,0,},
            {5,0,2,0,9,0,6,1,3,},
            {0,3,9,1,0,6,0,4,0,},
            {1,0,4,2,5,3,9,8,7,},
            {4,9,8,0,7,2,3,0,1,},
            {0,1,0,0,4,9,8,5,2,},
            {0,5,6,3,1,8,0,0,4,}
    };


    int[][] fullEasy11 = {
            {7,6,5,1,3,9,2,4,8,},
            {2,4,1,8,5,7,3,6,9,},
            {9,3,8,2,4,6,5,7,1,},
            {1,8,4,5,6,3,9,2,7,},
            {5,9,3,7,1,2,4,8,6,},
            {6,7,2,9,8,4,1,5,3,},
            {8,5,7,3,2,1,6,9,4,},
            {4,1,9,6,7,5,8,3,2,},
            {3,2,6,4,9,8,7,1,5,}
    };


    int[][] easy11 = {
            {7,6,5,0,3,9,2,0,0,},
            {2,4,0,8,5,7,3,6,9,},
            {9,0,0,2,0,0,5,7,1,},
            {1,0,0,5,6,0,0,2,7,},
            {5,9,3,0,0,2,4,8,6,},
            {6,7,0,9,8,4,1,5,0,},
            {8,5,7,3,2,0,6,0,4,},
            {0,1,9,6,7,5,8,3,2,},
            {3,0,6,0,0,8,7,0,5,}
    };


    int[][] fullEasy12 = {
            {9,1,5,4,8,2,3,6,7,},
            {7,2,6,1,9,3,5,4,8,},
            {8,3,4,7,6,5,1,2,9,},
            {2,4,9,8,5,6,7,3,1,},
            {1,6,3,2,7,9,4,8,5,},
            {5,7,8,3,4,1,2,9,6,},
            {4,8,1,6,2,7,9,5,3,},
            {3,5,2,9,1,8,6,7,4,},
            {6,9,7,5,3,4,8,1,2,}
    };


    int[][] easy12 = {
            {0,1,0,4,8,0,3,6,7,},
            {7,2,6,1,9,0,0,4,0,},
            {8,3,4,7,6,5,1,0,9,},
            {2,4,0,8,5,6,7,3,1,},
            {0,6,0,2,7,0,4,8,0,},
            {5,7,8,0,0,1,0,0,6,},
            {4,0,1,6,2,7,9,0,0,},
            {3,5,2,9,1,0,0,7,4,},
            {0,0,7,0,3,0,8,1,2,}
    };


    int[][] fullEasy13 = {
            {6,9,1,4,7,2,3,5,8,},
            {5,3,4,8,9,6,1,2,7,},
            {7,2,8,3,1,5,9,4,6,},
            {4,7,9,5,8,1,2,6,3,},
            {2,5,6,9,3,4,8,7,1,},
            {1,8,3,6,2,7,4,9,5,},
            {3,4,5,1,6,9,7,8,2,},
            {8,6,2,7,4,3,5,1,9,},
            {9,1,7,2,5,8,6,3,4,}
    };


    int[][] easy13 = {
            {6,0,1,4,7,2,0,5,8,},
            {5,3,4,8,0,0,0,2,7,},
            {0,0,8,3,1,0,9,4,6,},
            {0,7,9,5,0,1,2,6,0,},
            {2,0,6,9,3,4,8,7,0,},
            {1,0,3,6,0,7,4,9,5,},
            {3,4,5,1,6,9,7,8,2,},
            {8,0,2,7,4,3,0,1,0,},
            {0,1,7,0,0,0,6,3,4,}
    };


    int[][] fullEasy14 = {
            {3,2,1,6,5,8,4,7,9,},
            {7,5,4,2,9,3,8,1,6,},
            {9,8,6,1,7,4,2,5,3,},
            {1,3,7,5,4,6,9,2,8,},
            {8,4,9,3,1,2,7,6,5,},
            {2,6,5,9,8,7,3,4,1,},
            {4,9,2,8,6,5,1,3,7,},
            {5,7,8,4,3,1,6,9,2,},
            {6,1,3,7,2,9,5,8,4,}
    };


    int[][] easy14 = {
            {3,0,1,6,0,8,0,7,9,},
            {7,5,4,2,9,0,8,1,6,},
            {9,0,6,1,0,4,2,5,0,},
            {1,0,7,5,4,6,9,2,8,},
            {0,4,0,0,1,2,7,6,5,},
            {2,6,5,0,8,0,0,4,0,},
            {4,0,2,8,6,5,1,3,0,},
            {0,7,8,0,3,0,6,9,2,},
            {0,1,3,7,2,9,5,0,4,}
    };


    int[][] fullEasy15 = {
            {5,2,7,3,8,1,4,6,9,},
            {4,9,1,2,5,6,8,3,7,},
            {3,8,6,4,9,7,2,1,5,},
            {6,5,3,7,4,8,1,9,2,},
            {1,7,2,9,3,5,6,8,4,},
            {9,4,8,1,6,2,5,7,3,},
            {2,3,5,6,1,9,7,4,8,},
            {7,6,4,8,2,3,9,5,1,},
            {8,1,9,5,7,4,3,2,6,}
    };


    int[][] easy15 = {
            {5,2,7,3,8,1,4,0,9,},
            {4,9,1,0,5,6,8,3,7,},
            {0,0,6,4,9,0,0,1,5,},
            {6,5,3,7,0,8,1,0,2,},
            {1,7,2,9,3,5,0,8,4,},
            {0,4,0,0,6,2,5,7,3,},
            {2,3,5,6,1,9,7,4,0,},
            {7,0,4,0,0,3,9,5,1,},
            {0,0,9,5,7,4,3,2,0,}
    };


    int[][] fullEasy16 = {
            {3,2,9,1,7,8,6,4,5,},
            {6,1,8,4,2,5,9,7,3,},
            {7,4,5,3,9,6,1,2,8,},
            {4,5,2,9,8,3,7,1,6,},
            {8,3,1,7,6,2,4,5,9,},
            {9,7,6,5,4,1,3,8,2,},
            {5,8,4,6,3,7,2,9,1,},
            {1,9,3,2,5,4,8,6,7,},
            {2,6,7,8,1,9,5,3,4,}
    };


    int[][] easy16 = {
            {3,2,9,0,7,8,6,4,0,},
            {6,0,8,4,0,5,0,7,3,},
            {0,0,5,3,0,6,1,2,0,},
            {4,5,2,9,0,3,7,1,0,},
            {0,3,1,7,6,2,0,5,9,},
            {9,0,6,0,0,1,0,8,2,},
            {0,8,4,6,0,7,0,9,1,},
            {1,0,3,2,0,4,0,6,7,},
            {2,0,7,8,1,0,0,3,4,}
    };


    int[][] fullEasy17 = {
            {9,4,3,1,5,6,2,7,8,},
            {7,6,5,8,9,2,1,3,4,},
            {8,1,2,7,4,3,5,6,9,},
            {4,9,1,5,8,7,3,2,6,},
            {2,7,6,9,3,4,8,1,5,},
            {5,3,8,2,6,1,9,4,7,},
            {3,8,7,4,1,9,6,5,2,},
            {1,2,9,6,7,5,4,8,3,},
            {6,5,4,3,2,8,7,9,1,}
    };


    int[][] easy17 = {
            {9,4,3,1,0,6,2,0,8,},
            {0,6,0,8,0,2,1,0,4,},
            {8,1,2,7,4,3,5,6,9,},
            {4,9,1,5,0,7,3,0,6,},
            {2,7,6,0,3,4,8,1,5,},
            {0,3,0,2,0,1,9,0,7,},
            {3,0,7,4,1,9,6,0,2,},
            {1,2,0,6,7,5,4,0,3,},
            {0,5,4,0,0,8,7,9,0,}
    };


    int[][] fullEasy18 = {
            {2,1,7,8,5,3,9,6,4,},
            {9,8,6,1,4,2,5,3,7,},
            {3,4,5,6,9,7,1,2,8,},
            {4,6,1,3,2,9,7,8,5,},
            {7,2,8,4,6,5,3,1,9,},
            {5,9,3,7,1,8,6,4,2,},
            {6,3,9,2,7,4,8,5,1,},
            {1,5,2,9,8,6,4,7,3,},
            {8,7,4,5,3,1,2,9,6,}
    };


    int[][] easy18 = {
            {2,1,7,8,0,3,0,6,4,},
            {0,0,6,1,4,0,5,3,7,},
            {3,4,0,6,9,7,1,2,0,},
            {4,6,1,3,0,9,0,8,5,},
            {7,2,0,4,6,0,3,1,9,},
            {5,9,0,0,1,8,0,4,2,},
            {0,3,9,2,0,4,8,5,1,},
            {1,5,2,9,0,6,4,0,3,},
            {8,7,0,0,3,1,2,0,6,}
    };


    int[][] fullEasy19 = {
            {6,5,3,8,4,1,9,7,2,},
            {1,9,2,6,7,3,8,4,5,},
            {8,4,7,5,2,9,6,3,1,},
            {9,1,5,3,8,4,7,2,6,},
            {2,3,4,7,9,6,1,5,8,},
            {7,6,8,2,1,5,3,9,4,},
            {4,8,1,9,3,2,5,6,7,},
            {3,7,6,4,5,8,2,1,9,},
            {5,2,9,1,6,7,4,8,3,}
    };


    int[][] easy19 = {
            {6,0,3,8,0,0,9,0,2,},
            {1,0,2,6,7,3,8,0,5,},
            {8,0,7,0,2,9,6,3,1,},
            {0,1,0,3,8,0,7,2,6,},
            {2,3,4,7,9,6,1,0,8,},
            {7,6,0,2,0,5,0,9,4,},
            {4,8,0,9,3,2,0,6,7,},
            {3,7,0,0,0,8,2,0,9,},
            {5,0,9,1,0,7,4,8,3,}
    };


    int[][] fullEasy20 = {
            {4,3,5,1,2,7,6,8,9,},
            {1,6,9,3,5,8,2,7,4,},
            {2,7,8,9,4,6,5,3,1,},
            {5,1,7,4,8,9,3,2,6,},
            {6,8,4,7,3,2,1,9,5,},
            {3,9,2,6,1,5,8,4,7,},
            {7,5,3,8,9,1,4,6,2,},
            {9,4,1,2,6,3,7,5,8,},
            {8,2,6,5,7,4,9,1,3,}
    };


    int[][] easy20 = {
            {4,0,0,1,0,0,6,0,0,},
            {1,0,9,3,5,8,0,7,4,},
            {2,7,8,0,4,6,5,3,1,},
            {5,1,7,4,8,9,3,2,6,},
            {6,8,0,7,3,2,1,0,5,},
            {3,9,0,6,0,0,0,4,0,},
            {0,5,3,8,0,1,4,0,2,},
            {9,0,1,0,6,3,7,5,8,},
            {0,2,6,5,0,4,9,1,0,}
    };


    int[][] fullEasy21 = {
            {8,1,9,4,5,2,3,7,6,},
            {7,6,3,8,1,9,2,4,5,},
            {4,2,5,3,6,7,8,1,9,},
            {2,7,1,6,3,5,9,8,4,},
            {9,3,6,2,4,8,7,5,1,},
            {5,8,4,9,7,1,6,3,2,},
            {1,4,8,7,9,6,5,2,3,},
            {6,5,7,1,2,3,4,9,8,},
            {3,9,2,5,8,4,1,6,7,}
    };


    int[][] easy21 = {
            {8,1,9,4,0,2,0,0,6,},
            {0,6,3,8,0,0,2,4,5,},
            {4,2,0,3,6,7,8,0,9,},
            {2,7,0,6,3,5,9,0,4,},
            {0,3,0,2,0,8,0,5,0,},
            {5,8,4,9,0,0,6,3,2,},
            {1,4,8,7,0,0,0,0,3,},
            {0,0,7,0,2,3,4,9,8,},
            {0,9,2,5,8,4,1,6,0,}
    };


    int[][] fullEasy22 = {
            {6,8,1,7,5,9,2,4,3,},
            {2,5,9,4,8,3,7,6,1,},
            {4,3,7,1,6,2,5,8,9,},
            {5,1,6,8,9,7,3,2,4,},
            {3,2,4,6,1,5,8,9,7,},
            {7,9,8,3,2,4,6,1,5,},
            {1,7,2,5,4,8,9,3,6,},
            {8,4,5,9,3,6,1,7,2,},
            {9,6,3,2,7,1,4,5,8,}
    };


    int[][] easy22 = {
            {6,0,1,7,5,9,0,4,0,},
            {2,5,9,4,8,0,0,6,1,},
            {4,3,0,1,6,0,5,8,9,},
            {5,1,6,0,9,7,3,2,0,},
            {3,2,0,6,1,5,8,9,7,},
            {0,9,8,0,2,0,6,0,5,},
            {1,0,2,0,4,8,0,3,0,},
            {8,4,0,9,3,6,1,7,2,},
            {9,0,3,2,0,1,4,5,8,}
    };


    int[][] fullEasy23 = {
            {4,9,1,3,8,2,6,5,7,},
            {5,2,7,6,9,4,1,3,8,},
            {3,6,8,1,5,7,9,2,4,},
            {1,7,5,2,3,9,4,8,6,},
            {8,4,2,5,6,1,3,7,9,},
            {6,3,9,7,4,8,5,1,2,},
            {2,8,6,9,1,3,7,4,5,},
            {7,5,3,4,2,6,8,9,1,},
            {9,1,4,8,7,5,2,6,3,}
    };


    int[][] easy23 = {
            {4,9,0,3,8,0,6,0,7,},
            {5,0,7,6,9,0,1,3,8,},
            {3,0,8,1,5,0,0,2,4,},
            {1,7,5,2,3,9,4,8,0,},
            {8,4,0,5,0,0,3,7,0,},
            {0,3,9,0,4,8,5,1,2,},
            {0,8,0,9,1,3,7,4,5,},
            {0,5,3,4,2,0,8,9,1,},
            {9,1,4,8,0,5,0,6,0,}
    };


    int[][] fullEasy24 = {
            {8,7,9,4,1,6,5,2,3,},
            {6,3,4,5,2,7,9,1,8,},
            {1,5,2,9,3,8,4,7,6,},
            {2,1,6,7,5,4,8,3,9,},
            {5,9,3,6,8,2,1,4,7,},
            {7,4,8,3,9,1,6,5,2,},
            {3,8,5,1,7,9,2,6,4,},
            {9,6,7,2,4,5,3,8,1,},
            {4,2,1,8,6,3,7,9,5,}
    };


    int[][] easy24 = {
            {8,0,9,0,1,6,5,2,3,},
            {0,3,0,5,2,7,9,1,0,},
            {1,5,2,9,0,8,4,0,6,},
            {2,1,6,7,5,0,0,0,9,},
            {0,9,0,0,8,0,1,4,7,},
            {0,4,8,3,9,1,6,5,2,},
            {3,8,0,1,0,9,2,6,4,},
            {0,6,7,0,0,5,0,8,0,},
            {4,2,0,8,6,3,7,9,5,}
    };


    int[][] fullEasy25 = {
            {9,2,1,4,7,5,8,3,6,},
            {4,3,7,2,6,8,9,1,5,},
            {6,8,5,9,1,3,4,2,7,},
            {1,6,9,5,3,2,7,8,4,},
            {8,7,4,1,9,6,2,5,3,},
            {3,5,2,8,4,7,1,6,9,},
            {5,4,8,3,2,9,6,7,1,},
            {7,9,3,6,8,1,5,4,2,},
            {2,1,6,7,5,4,3,9,8,}
    };


    int[][] easy25 = {
            {0,0,1,4,7,5,8,3,6,},
            {4,0,7,2,0,8,9,1,5,},
            {6,8,5,9,0,3,4,0,0,},
            {1,6,0,5,0,2,7,0,4,},
            {8,0,4,1,9,6,2,5,3,},
            {3,5,2,0,4,7,0,6,9,},
            {5,4,0,3,2,9,6,7,1,},
            {7,0,3,6,8,0,5,0,2,},
            {2,1,6,0,5,4,3,0,8,}
    };


    int[][] fullEasy26 = {
            {3,4,6,9,8,5,1,2,7,},
            {7,1,9,4,2,3,8,6,5,},
            {5,2,8,1,6,7,3,9,4,},
            {9,5,3,6,4,1,7,8,2,},
            {2,6,7,3,5,8,9,4,1,},
            {1,8,4,7,9,2,5,3,6,},
            {8,7,1,2,3,6,4,5,9,},
            {4,3,2,5,7,9,6,1,8,},
            {6,9,5,8,1,4,2,7,3,}
    };


    int[][] easy26 = {
            {3,4,0,9,0,5,1,0,7,},
            {7,1,9,4,0,0,0,6,5,},
            {5,2,0,1,6,7,3,9,4,},
            {9,5,0,0,4,1,7,8,2,},
            {2,0,7,3,5,8,9,4,0,},
            {1,8,0,7,9,0,0,0,6,},
            {8,7,1,2,3,6,4,5,9,},
            {4,0,0,5,0,0,6,1,0,},
            {6,9,0,8,1,4,2,0,3,}
    };


    int[][] fullEasy27 = {
            {2,3,9,6,4,7,5,1,8,},
            {4,1,5,3,2,8,7,9,6,},
            {7,8,6,1,5,9,3,4,2,},
            {6,2,8,9,1,3,4,7,5,},
            {9,5,7,2,8,4,1,6,3,},
            {3,4,1,5,7,6,2,8,9,},
            {5,7,4,8,6,2,9,3,1,},
            {1,6,3,7,9,5,8,2,4,},
            {8,9,2,4,3,1,6,5,7,}
    };


    int[][] easy27 = {
            {2,3,0,6,4,7,5,1,8,},
            {4,1,5,3,2,0,7,0,6,},
            {0,8,6,1,0,9,3,4,0,},
            {0,0,8,0,1,3,4,7,5,},
            {9,5,7,2,0,4,1,6,3,},
            {3,4,1,5,7,0,2,0,0,},
            {5,7,4,0,6,2,9,3,1,},
            {1,0,0,7,9,0,0,2,0,},
            {0,9,2,4,3,0,0,5,7,}
    };


    int[][] fullEasy28 = {
            {6,3,9,7,8,1,4,5,2,},
            {2,4,8,3,5,9,7,6,1,},
            {1,5,7,6,4,2,8,9,3,},
            {4,8,2,9,7,5,3,1,6,},
            {9,1,3,8,2,6,5,4,7,},
            {5,7,6,1,3,4,2,8,9,},
            {8,2,1,5,9,7,6,3,4,},
            {7,6,5,4,1,3,9,2,8,},
            {3,9,4,2,6,8,1,7,5,}
    };


    int[][] easy28 = {
            {6,3,9,7,8,1,4,5,0,},
            {2,0,8,3,5,9,7,6,0,},
            {0,5,0,0,0,0,8,9,3,},
            {4,8,2,9,0,5,3,1,6,},
            {9,0,0,8,2,6,5,4,0,},
            {5,7,0,1,3,0,0,8,9,},
            {8,2,0,0,9,7,6,3,4,},
            {7,6,5,4,1,3,9,2,0,},
            {3,0,4,2,6,0,1,0,0,}
    };


    int[][] fullEasy29 = {
            {3,7,6,8,5,4,9,1,2,},
            {9,4,2,6,7,1,3,8,5,},
            {5,8,1,2,9,3,4,6,7,},
            {7,2,3,9,1,6,5,4,8,},
            {8,6,9,3,4,5,2,7,1,},
            {4,1,5,7,2,8,6,3,9,},
            {6,5,8,1,3,9,7,2,4,},
            {2,3,4,5,8,7,1,9,6,},
            {1,9,7,4,6,2,8,5,3,}
    };


    int[][] easy29 = {
            {3,0,0,8,5,4,9,1,0,},
            {9,4,2,6,7,1,3,8,5,},
            {5,8,1,0,9,0,4,6,0,},
            {7,2,3,0,1,6,0,0,8,},
            {8,6,0,0,0,5,2,7,1,},
            {0,1,5,7,2,8,6,3,9,},
            {0,5,8,0,3,9,0,2,0,},
            {2,3,4,5,8,0,1,9,6,},
            {1,9,0,0,6,2,8,5,3,}
    };


    int[][] fullEasy30 = {
            {7,6,9,2,5,8,4,3,1,},
            {5,3,4,7,9,1,8,2,6,},
            {1,2,8,6,4,3,5,9,7,},
            {9,7,2,5,8,6,1,4,3,},
            {6,8,3,4,1,7,9,5,2,},
            {4,1,5,9,3,2,7,6,8,},
            {8,5,6,3,7,9,2,1,4,},
            {3,9,1,8,2,4,6,7,5,},
            {2,4,7,1,6,5,3,8,9,}
    };


    int[][] easy30 = {
            {7,6,0,2,0,8,4,0,0,},
            {5,3,4,7,9,1,0,2,6,},
            {1,0,0,6,4,0,5,9,7,},
            {0,7,0,0,8,6,1,0,3,},
            {6,8,0,0,1,7,0,5,2,},
            {4,1,5,9,3,2,7,6,0,},
            {8,5,6,0,0,9,0,1,4,},
            {0,9,1,8,2,4,6,7,5,},
            {2,4,0,1,6,5,3,8,0,}
    };


    int[][] fullEasy31 = {
            {9,8,7,1,6,2,5,3,4,},
            {4,2,6,3,7,5,1,8,9,},
            {3,1,5,9,4,8,6,2,7,},
            {5,7,8,4,2,1,9,6,3,},
            {6,9,2,5,8,3,4,7,1,},
            {1,3,4,7,9,6,8,5,2,},
            {8,6,9,2,1,7,3,4,5,},
            {2,4,3,8,5,9,7,1,6,},
            {7,5,1,6,3,4,2,9,8,}
    };


    int[][] easy31 = {
            {9,8,0,1,6,2,5,0,4,},
            {0,2,0,0,7,0,1,8,9,},
            {3,1,5,9,4,8,6,2,0,},
            {0,7,8,4,2,1,9,6,3,},
            {6,9,0,0,8,3,0,0,1,},
            {1,0,4,7,9,0,8,5,2,},
            {8,0,9,2,0,7,3,4,5,},
            {2,4,3,0,5,9,0,1,6,},
            {7,0,1,6,3,4,2,0,0,}
    };


    int[][] fullEasy32 = {
            {3,1,8,2,7,4,5,9,6,},
            {9,2,7,6,5,3,8,4,1,},
            {6,4,5,8,9,1,2,3,7,},
            {7,6,1,4,3,2,9,5,8,},
            {2,8,3,9,6,5,7,1,4,},
            {4,5,9,1,8,7,3,6,2,},
            {8,9,2,3,4,6,1,7,5,},
            {5,3,6,7,1,8,4,2,9,},
            {1,7,4,5,2,9,6,8,3,}
    };


    int[][] easy32 = {
            {3,0,8,2,0,0,5,0,6,},
            {9,2,7,6,0,3,8,4,0,},
            {6,4,0,8,9,1,2,3,0,},
            {0,6,1,0,0,2,9,5,8,},
            {0,8,0,9,0,5,0,1,4,},
            {4,5,9,1,8,7,3,0,2,},
            {8,0,2,3,0,6,0,7,5,},
            {5,0,6,7,1,0,4,2,0,},
            {1,0,4,5,2,9,6,8,3,}
    };


    int[][] fullEasy33 = {
            {8,3,4,6,9,7,5,1,2,},
            {1,9,7,2,8,5,4,6,3,},
            {5,6,2,3,1,4,9,7,8,},
            {9,2,5,8,3,6,1,4,7,},
            {7,1,8,4,5,2,3,9,6,},
            {6,4,3,1,7,9,8,2,5,},
            {4,7,1,5,2,8,6,3,9,},
            {2,5,6,9,4,3,7,8,1,},
            {3,8,9,7,6,1,2,5,4,}
    };


    int[][] easy33 = {
            {0,3,4,6,9,7,0,1,2,},
            {1,9,7,2,8,0,4,0,3,},
            {0,0,2,3,0,4,9,7,0,},
            {9,2,0,8,3,6,1,0,0,},
            {7,1,8,4,0,2,3,0,6,},
            {6,0,3,1,7,0,8,2,5,},
            {4,7,1,5,0,8,6,3,0,},
            {0,0,6,9,4,3,0,8,1,},
            {3,8,9,7,0,0,2,5,4,}
    };


    int[][] fullEasy34 = {
            {2,9,4,6,5,1,7,8,3,},
            {7,5,3,9,8,4,1,6,2,},
            {6,1,8,3,2,7,5,9,4,},
            {1,8,7,5,6,2,4,3,9,},
            {4,6,9,1,7,3,2,5,8,},
            {3,2,5,4,9,8,6,7,1,},
            {9,3,2,7,4,5,8,1,6,},
            {5,4,6,8,1,9,3,2,7,},
            {8,7,1,2,3,6,9,4,5,}
    };


    int[][] easy34 = {
            {0,9,4,6,0,0,7,8,0,},
            {7,0,3,9,8,4,1,6,2,},
            {6,1,0,0,2,7,0,9,4,},
            {1,8,7,5,6,0,4,3,9,},
            {4,0,9,1,7,3,0,0,8,},
            {0,2,5,4,9,0,6,0,1,},
            {9,0,2,0,4,0,8,1,0,},
            {5,4,0,8,1,9,3,0,7,},
            {8,0,1,2,3,0,0,4,5,}
    };


    int[][] fullEasy35 = {
            {6,4,5,9,8,2,1,7,3,},
            {2,7,8,3,6,1,9,5,4,},
            {9,1,3,7,5,4,6,8,2,},
            {1,6,2,8,9,5,4,3,7,},
            {5,9,4,1,7,3,8,2,6,},
            {8,3,7,2,4,6,5,1,9,},
            {4,8,6,5,3,7,2,9,1,},
            {7,2,9,6,1,8,3,4,5,},
            {3,5,1,4,2,9,7,6,8,}
    };


    int[][] easy35 = {
            {6,4,0,0,0,2,0,7,3,},
            {0,7,8,3,0,1,9,5,4,},
            {9,1,0,7,5,4,0,8,2,},
            {1,6,2,8,9,5,4,3,7,},
            {5,0,4,0,0,3,8,0,6,},
            {0,3,7,2,0,6,5,0,0,},
            {0,0,6,5,3,7,0,9,1,},
            {7,2,9,6,1,0,0,4,5,},
            {3,5,0,4,0,9,7,6,8,}
    };


    int[][] fullEasy36 = {
            {4,6,2,5,7,9,1,8,3,},
            {8,9,7,1,3,2,4,6,5,},
            {1,5,3,6,4,8,7,2,9,},
            {5,3,6,4,9,7,8,1,2,},
            {9,1,8,2,5,6,3,7,4,},
            {2,7,4,3,8,1,9,5,6,},
            {7,4,5,8,6,3,2,9,1,},
            {3,2,9,7,1,5,6,4,8,},
            {6,8,1,9,2,4,5,3,7,}
    };


    int[][] easy36 = {
            {0,0,2,5,0,9,0,8,3,},
            {8,9,7,1,0,2,4,6,5,},
            {1,5,3,6,4,8,7,2,0,},
            {5,3,6,4,9,0,0,1,2,},
            {0,0,8,2,0,0,0,7,0,},
            {2,7,0,3,8,1,9,5,6,},
            {7,4,5,8,0,3,2,0,0,},
            {0,2,9,0,1,5,6,4,8,},
            {6,8,0,0,2,4,5,3,0,}
    };


    int[][] fullEasy37 = {
            {4,9,7,8,5,6,3,2,1,},
            {8,5,2,1,3,4,9,7,6,},
            {1,6,3,7,2,9,4,5,8,},
            {2,8,5,4,1,7,6,3,9,},
            {7,4,9,6,8,3,2,1,5,},
            {3,1,6,5,9,2,7,8,4,},
            {6,7,8,3,4,5,1,9,2,},
            {5,2,4,9,7,1,8,6,3,},
            {9,3,1,2,6,8,5,4,7,}
    };


    int[][] easy37 = {
            {0,9,7,8,5,6,3,0,0,},
            {8,5,2,1,0,4,9,7,6,},
            {0,6,3,0,2,0,4,5,0,},
            {2,8,0,4,1,0,0,3,9,},
            {7,0,9,6,0,3,2,1,0,},
            {3,1,6,5,9,2,7,8,4,},
            {6,7,0,3,0,5,1,9,0,},
            {5,0,4,9,7,1,8,6,3,},
            {9,3,1,0,6,0,0,4,7,}
    };


    int[][] fullEasy38 = {
            {5,4,9,7,8,3,6,2,1,},
            {7,8,6,2,1,9,3,5,4,},
            {3,1,2,6,4,5,8,9,7,},
            {1,3,4,5,2,6,7,8,9,},
            {9,7,5,8,3,1,2,4,6,},
            {6,2,8,9,7,4,5,1,3,},
            {4,9,7,3,5,2,1,6,8,},
            {2,6,3,1,9,8,4,7,5,},
            {8,5,1,4,6,7,9,3,2,}
    };


    int[][] easy38 = {
            {5,4,9,7,8,3,6,2,0,},
            {7,8,0,0,1,9,0,5,4,},
            {3,1,0,6,4,0,0,9,7,},
            {1,3,0,5,2,0,7,0,9,},
            {9,7,5,8,0,1,2,0,6,},
            {6,2,0,9,7,4,5,0,3,},
            {0,9,7,3,0,2,1,0,8,},
            {2,6,3,0,9,8,0,0,5,},
            {0,5,1,4,0,7,9,3,2,}
    };


    int[][] fullEasy39 = {
            {4,9,2,1,3,8,7,6,5,},
            {7,8,6,4,5,2,1,9,3,},
            {5,3,1,7,6,9,4,2,8,},
            {8,1,5,9,2,3,6,4,7,},
            {2,6,3,8,7,4,9,5,1,},
            {9,4,7,5,1,6,8,3,2,},
            {1,2,4,3,9,7,5,8,6,},
            {3,5,8,6,4,1,2,7,9,},
            {6,7,9,2,8,5,3,1,4,}
    };


    int[][] easy39 = {
            {4,9,2,1,3,8,7,0,5,},
            {7,8,6,4,5,0,1,9,3,},
            {0,0,1,0,6,9,4,2,0,},
            {8,1,5,0,2,3,6,4,7,},
            {2,0,3,8,7,4,9,5,1,},
            {9,0,0,5,0,6,8,0,0,},
            {1,2,4,0,9,7,0,8,6,},
            {3,5,8,6,4,1,2,7,9,},
            {0,0,0,0,8,0,0,0,4,}
    };


    int[][] fullEasy40 = {
            {1,2,6,9,4,8,5,3,7,},
            {7,3,8,5,6,1,4,2,9,},
            {4,9,5,7,3,2,6,1,8,},
            {3,1,9,2,7,5,8,4,6,},
            {2,6,4,8,9,3,1,7,5,},
            {8,5,7,6,1,4,3,9,2,},
            {9,4,2,1,5,6,7,8,3,},
            {6,8,3,4,2,7,9,5,1,},
            {5,7,1,3,8,9,2,6,4,}
    };


    int[][] easy40 = {
            {1,2,6,9,4,0,0,3,7,},
            {0,3,0,0,6,1,4,2,0,},
            {4,9,5,7,3,2,6,1,0,},
            {3,0,9,2,7,5,8,4,6,},
            {2,0,0,8,0,0,0,7,5,},
            {8,5,7,6,1,4,3,0,2,},
            {0,0,2,1,5,6,7,0,0,},
            {6,0,3,4,0,7,9,5,1,},
            {5,7,1,3,0,9,2,6,4,}
    };


    int[][] fullEasy41 = {
            {7,8,4,5,3,9,2,6,1,},
            {3,1,2,6,7,4,8,5,9,},
            {6,5,9,2,1,8,7,4,3,},
            {9,6,1,8,2,3,4,7,5,},
            {8,4,7,9,5,1,3,2,6,},
            {2,3,5,7,4,6,1,9,8,},
            {4,9,8,1,6,7,5,3,2,},
            {5,7,6,3,8,2,9,1,4,},
            {1,2,3,4,9,5,6,8,7,}
    };


    int[][] easy41 = {
            {7,8,4,5,3,9,2,6,1,},
            {0,0,2,6,7,4,0,5,9,},
            {6,5,9,2,0,0,0,4,3,},
            {9,0,1,8,0,0,0,7,0,},
            {0,4,0,9,5,1,3,0,6,},
            {2,3,5,0,4,6,1,9,8,},
            {4,9,0,1,6,7,5,3,2,},
            {0,7,6,3,8,0,9,1,4,},
            {1,2,3,0,9,5,0,0,7,}
    };


    int[][] fullEasy42 = {
            {7,8,4,3,6,9,2,1,5,},
            {1,6,3,8,2,5,9,7,4,},
            {5,2,9,4,7,1,8,6,3,},
            {4,9,8,2,3,6,1,5,7,},
            {2,3,7,1,5,8,6,4,9,},
            {6,1,5,9,4,7,3,8,2,},
            {8,7,1,5,9,3,4,2,6,},
            {3,4,6,7,8,2,5,9,1,},
            {9,5,2,6,1,4,7,3,8,}
    };


    int[][] easy42 = {
            {7,8,0,3,0,9,0,1,5,},
            {0,6,0,8,2,5,9,7,4,},
            {5,2,9,0,7,1,8,6,0,},
            {4,9,8,2,3,6,0,0,7,},
            {0,0,7,0,5,8,6,4,0,},
            {6,1,5,9,4,0,3,8,2,},
            {8,0,1,0,9,3,4,2,6,},
            {0,4,6,7,8,0,0,9,1,},
            {0,5,2,6,1,4,7,0,8,}
    };


    int[][] fullEasy43 = {
            {1,8,7,9,5,2,3,4,6,},
            {6,9,3,7,8,4,5,2,1,},
            {5,2,4,6,3,1,7,9,8,},
            {2,4,6,5,1,7,9,8,3,},
            {8,1,9,2,6,3,4,5,7,},
            {7,3,5,8,4,9,1,6,2,},
            {4,5,1,3,2,8,6,7,9,},
            {3,7,8,4,9,6,2,1,5,},
            {9,6,2,1,7,5,8,3,4,}
    };


    int[][] easy43 = {
            {1,8,7,9,5,2,3,4,6,},
            {6,0,0,0,8,4,5,2,1,},
            {0,2,4,6,3,0,0,0,0,},
            {0,4,6,5,1,7,9,8,3,},
            {0,1,9,2,6,3,4,5,0,},
            {7,3,5,8,0,0,1,6,0,},
            {4,5,1,3,2,8,0,7,0,},
            {0,7,8,0,0,6,2,0,5,},
            {9,0,2,1,7,0,8,3,4,}
    };


    int[][] fullEasy44 = {
            {3,1,9,6,2,4,8,5,7,},
            {5,8,4,3,9,7,6,2,1,},
            {6,2,7,8,5,1,9,4,3,},
            {7,9,2,1,4,6,5,3,8,},
            {4,3,8,5,7,2,1,6,9,},
            {1,5,6,9,8,3,2,7,4,},
            {9,6,1,7,3,5,4,8,2,},
            {8,4,3,2,6,9,7,1,5,},
            {2,7,5,4,1,8,3,9,6,}
    };


    int[][] easy44 = {
            {0,1,9,6,0,4,0,5,0,},
            {5,0,4,3,9,0,6,2,1,},
            {6,2,7,8,5,1,9,4,3,},
            {7,9,0,1,4,6,5,3,8,},
            {4,3,0,0,7,2,1,6,9,},
            {1,5,0,0,0,3,0,7,0,},
            {0,6,1,7,0,5,4,0,2,},
            {8,4,3,2,6,9,7,1,0,},
            {2,0,5,4,1,0,0,9,6,}
    };


    int[][] fullEasy45 = {
            {8,6,9,7,4,2,3,5,1,},
            {3,7,5,1,8,9,6,4,2,},
            {1,2,4,3,5,6,7,8,9,},
            {2,1,8,9,7,5,4,6,3,},
            {5,4,6,8,3,1,2,9,7,},
            {9,3,7,2,6,4,8,1,5,},
            {4,9,3,5,2,8,1,7,6,},
            {7,8,1,6,9,3,5,2,4,},
            {6,5,2,4,1,7,9,3,8,}
    };


    int[][] easy45 = {
            {0,6,9,7,4,2,3,5,0,},
            {3,7,5,1,0,9,6,0,2,},
            {1,0,4,3,5,0,0,8,9,},
            {2,1,8,9,0,5,0,6,3,},
            {0,4,6,8,0,1,2,9,0,},
            {0,3,0,0,6,4,8,1,5,},
            {4,9,0,5,2,0,0,7,6,},
            {7,0,0,6,9,3,5,2,0,},
            {6,5,2,0,0,7,9,3,8,}
    };


    int[][] fullEasy46 = {
            {7,8,6,1,9,3,2,5,4,},
            {4,9,5,6,2,8,3,7,1,},
            {2,3,1,4,5,7,6,9,8,},
            {3,1,7,8,6,4,5,2,9,},
            {8,5,9,2,3,1,7,4,6,},
            {6,4,2,5,7,9,1,8,3,},
            {1,7,3,9,4,5,8,6,2,},
            {5,6,4,3,8,2,9,1,7,},
            {9,2,8,7,1,6,4,3,5,}
    };


    int[][] easy46 = {
            {7,0,6,1,9,3,2,0,4,},
            {4,9,5,6,2,0,3,0,1,},
            {2,0,0,4,0,7,6,9,0,},
            {3,1,7,8,0,4,5,2,0,},
            {8,5,9,2,0,1,7,4,6,},
            {0,0,2,0,7,9,1,0,3,},
            {1,7,0,9,4,5,8,6,2,},
            {5,6,4,0,8,0,9,1,7,},
            {0,0,8,7,0,6,0,0,5,}
    };


    int[][] fullEasy47 = {
            {3,5,2,7,8,1,4,9,6,},
            {9,1,8,4,3,6,7,2,5,},
            {6,7,4,2,9,5,3,1,8,},
            {1,3,5,8,6,9,2,7,4,},
            {4,6,7,3,1,2,8,5,9,},
            {8,2,9,5,4,7,1,6,3,},
            {7,8,6,1,5,3,9,4,2,},
            {2,9,3,6,7,4,5,8,1,},
            {5,4,1,9,2,8,6,3,7,}
    };


    int[][] easy47 = {
            {3,5,2,7,0,1,4,0,0,},
            {9,1,0,0,3,6,0,2,5,},
            {0,7,4,0,9,5,3,1,8,},
            {1,3,5,8,6,9,2,7,4,},
            {0,6,0,0,1,0,0,5,0,},
            {8,2,0,0,4,7,1,6,3,},
            {0,8,6,1,5,3,9,4,2,},
            {2,9,0,6,7,4,5,8,1,},
            {5,4,1,0,2,0,6,0,0,}
    };


    int[][] fullEasy48 = {
            {7,3,4,1,8,2,9,5,6,},
            {9,2,1,4,6,5,8,3,7,},
            {5,6,8,9,7,3,4,1,2,},
            {4,5,9,2,1,7,6,8,3,},
            {2,1,6,3,5,8,7,9,4,},
            {8,7,3,6,9,4,5,2,1,},
            {1,9,7,5,3,6,2,4,8,},
            {6,4,5,8,2,1,3,7,9,},
            {3,8,2,7,4,9,1,6,5,}
    };


    int[][] easy48 = {
            {7,3,4,1,8,2,9,5,0,},
            {9,2,1,4,0,0,8,3,7,},
            {5,0,0,0,7,3,0,0,2,},
            {4,5,9,2,1,0,6,8,3,},
            {2,0,6,3,0,0,7,9,0,},
            {0,7,3,6,9,4,0,2,1,},
            {1,9,0,0,3,6,2,4,0,},
            {0,4,0,8,0,1,0,7,9,},
            {3,8,2,7,0,9,1,6,0,}
    };


    int[][] fullEasy49 = {
            {9,4,2,1,6,7,3,8,5,},
            {6,8,5,9,3,4,1,2,7,},
            {3,1,7,8,2,5,4,9,6,},
            {7,5,4,6,8,2,9,1,3,},
            {1,2,3,5,7,9,6,4,8,},
            {8,9,6,3,4,1,5,7,2,},
            {4,7,9,2,5,6,8,3,1,},
            {5,3,1,7,9,8,2,6,4,},
            {2,6,8,4,1,3,7,5,9,}
    };


    int[][] easy49 = {
            {9,0,2,1,0,7,0,8,0,},
            {6,8,0,9,3,4,1,2,7,},
            {3,1,0,8,0,5,0,9,6,},
            {0,5,0,6,8,2,0,1,3,},
            {1,2,3,5,0,9,6,0,8,},
            {8,9,6,0,4,1,5,7,0,},
            {0,7,9,2,5,6,8,0,1,},
            {5,3,1,0,0,8,2,0,4,},
            {2,0,0,4,1,0,7,5,9,}
    };


    int[][] fullEasy50 = {
            {9,2,3,5,8,4,1,6,7,},
            {1,6,7,9,2,3,5,4,8,},
            {5,4,8,7,6,1,2,9,3,},
            {4,7,9,3,1,5,6,8,2,},
            {8,5,6,2,4,7,9,3,1,},
            {3,1,2,6,9,8,7,5,4,},
            {7,8,4,1,5,9,3,2,6,},
            {6,9,1,8,3,2,4,7,5,},
            {2,3,5,4,7,6,8,1,9,}
    };


    int[][] easy50 = {
            {9,2,3,5,8,4,1,6,0,},
            {1,0,7,9,0,3,5,0,8,},
            {0,4,8,0,6,0,2,9,3,},
            {4,7,0,0,1,5,6,8,0,},
            {8,5,0,2,0,7,9,3,1,},
            {0,1,2,6,9,8,0,5,4,},
            {0,0,4,1,5,0,3,2,6,},
            {6,9,1,8,3,2,0,7,5,},
            {2,0,5,4,0,0,0,1,9,}
    };


}
