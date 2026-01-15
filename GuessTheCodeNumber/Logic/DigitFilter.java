package GuessTheCodeNumber.Logic;

import GuessTheCodeNumber.Visual;

/**
 * Created by Eugene
 * create on 08/01/2026
 * Program description:
 */
// Class for filtering input
public class DigitFilter {

    // get user input
    Visual visual = new Visual();
    String userInput = visual.getUserInput();

    //get user input and check if it is a digit
    public boolean isDigit(String str) {
        return str.matches("[0-9]+");
    }

    //make array from user input
    char[] userInputArray = userInput.toCharArray();

    //check is the array equal 4 digits
    private void checkArrayLength(char[] user, String input) {
        if (user.length == 4) {
            showUserInput();
            makeIntArray(userInputArray);
        }
    }

    //print user input code on the screen
    private void showUserInput(){
        //Visual
    }

    //making int array from char array
    private void makeIntArray(char[] userInputArray) {
        for (int i = 0; i < userInputArray.length; i++) {
            GuessTheCodeNumber.Logic.GameLogic gameLogic = new GuessTheCodeNumber.Logic.GameLogic();
            gameLogic.userInput[i] = Character.getNumericValue(userInputArray[i]);
        }
    }
}