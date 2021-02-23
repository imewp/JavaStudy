package com.imewp.demo04;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 7;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0)
                return null;
        } catch (IOException e) {
            System.out.println("IOException：" + e);
        }
        return inputLine;
    }

    public ArrayList<String> placeDOtCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<>();
        String[] alphacoords = new String[comSize];
        String temp = null;
        int[] coords = new int[comSize];
        int attempts = 0;
        boolean success = false;
        int locaion = 0;

        comCount++;
        int incr = 1;
        if ((comCount % 2) == 1) {
            incr = gridLength;
        }

        while (!success & attempts++ < 200) {
            locaion = (int) (Math.random() * gridSize);
            int x = 0;
            success = true;
            while (success && x < comSize) {
                if (grid[locaion] == 0) {
                    if (grid[locaion] == 0) {
                        coords[x++] = locaion;
                        locaion += incr;
                        if (locaion >= gridSize) {
                            success = false;
                        }
                        if (x >= 0 && (locaion % gridLength == 0)) {
                            success = false;
                        }
                    } else {
                        success = false;
                    }
                }
            }
        }
        return alphaCells;
    }


}
