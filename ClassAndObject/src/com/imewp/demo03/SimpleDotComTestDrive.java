package com.imewp.demo03;


import java.util.ArrayList;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int ranomNum = (int) (Math.random() * 5);
        ArrayList<String> locations = new ArrayList<>();
        locations.add(String.valueOf(ranomNum));
        locations.add(String.valueOf(ranomNum + 1));
        locations.add(String.valueOf(ranomNum + 2));
        theDotCom.setLocationCells(locations);
        boolean isAlive = true; //创建出记录游戏是否继续进行的Boolean变量

        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
