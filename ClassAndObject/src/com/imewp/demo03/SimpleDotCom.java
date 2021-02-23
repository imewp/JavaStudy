package com.imewp.demo03;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<String> locationCells;
    private int numOfHits;

    public ArrayList<String> getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public int getNumOfHits() {
        return numOfHits;
    }

    public void setNumOfHits(int numOfHits) {
        this.numOfHits = numOfHits;
    }

    public SimpleDotCom() {
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0)
            locationCells.remove(index);
        if (locationCells.isEmpty()) {
            result = "kill";
        } else {
            result = "hit";
        }
        return result;
    }

}
