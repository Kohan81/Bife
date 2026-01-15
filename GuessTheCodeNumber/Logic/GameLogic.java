package GuessTheCodeNumber.Logic;

import javax.swing.*;
import GuessTheCodeNumber.Visual;

/**
 * Created by Eugene
 * create on 08/01/2026
 * Program description:
 */

public class GameLogic {

    private int[] secretCode = new int[4];
    int[] userInput = new int[4];

    private int rightDigits = 0;
    private int rightPlaces = 0;

    // create secret code to user, for his guessing
    private void createCode(){
        secretCode = CodeGenerator.generateCodeAsArray();
    }

    //get user input code
    private int getUserInput(){

        return 0;
    }

    //compare digits of user input with secret code
    private int compareCode(){
        return 0;
    }

    //compare user input with secret code and return the result
    //of the right places of guessing digits
    private String checkResult(){
        return "";
    }

    //check if the user won the game
    private boolean checkWin(){
        return false;
    }
}