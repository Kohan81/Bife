package GuessTheCodeNumber;

import java.util.Arrays;

/**
 * Created by Eugene
 * create on 08/01/2026
 * Program description:
 */

public class GameLogic {

    private int[] secretCode = new int[4];
    private int[] userInput = new int[4];

    // create secret code to user, for his guessing
    private void createCode(){
        secretCode = CodeGenerator.generateCodeAsArray();
    }

    public GameLogic(){
        createCode();
    }

    //get user input code
    public void getUserInput(String input){
        DigitFilter filter = new DigitFilter();
        userInput = filter.toIntArray(input); // use the passed string
    }

    //compare digits of user input with secret code
    public int compareCode(){
        int rightDigits = 0; // local variable
        boolean[] secretUsed = new boolean[4];
        boolean[] inputUsed = new boolean[4];

        // First, we count exact matches by position
        for (int i = 0; i < 4; i++) {
            if (userInput[i] == secretCode[i]) {
                rightDigits++;
                secretUsed[i] = true;
                inputUsed[i] = true;
            }
        }

        // count the matches in other positions
        for (int i = 0; i < 4; i++) {
            if (inputUsed[i]) continue; // exact match

            for (int j = 0; j < 4; j++) {
                if (secretUsed[j]) continue; // already used

                if (userInput[i] == secretCode[j]) {
                    rightDigits++;
                    secretUsed[j] = true;
                    break;
                }
            }
        }
        return rightDigits;
    }

    //compare user input with secret code and return the result
    //of the right places of guessing digits
    public int checkResult(){
        int rightPlaces = 0; // local variable
        for (int i = 0; i < 4; i++) {
            if (userInput[i] == secretCode[i]) {
                rightPlaces++;
            }
        }
        return rightPlaces;
    }

    //check if the user won the game
    public boolean checkWin(){
        return checkResult() == 4;
    }

        // For debugging - get the secret code
    public int[] getSecretCode() {
        return secretCode.clone();
    }
}