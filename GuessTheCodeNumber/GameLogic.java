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

    // Убрать rightDigits и rightPlaces как поля класса

    // create secret code to user, for his guessing
    private void createCode(){
        secretCode = CodeGenerator.generateCodeAsArray();
        System.out.println("Secret code: " + Arrays.toString(secretCode));
    }

    public GameLogic(){
        createCode();
    }

    //get user input code
    public void getUserInput(String input){ // ИЗМЕНИТЬ: принимать строку
        DigitFilter filter = new DigitFilter();
        userInput = filter.toIntArray(input); // использовать переданную строку
    }

    //compare digits of user input with secret code
    public int compareCode(){
        int rightDigits = 0; // локальная переменная
        boolean[] secretUsed = new boolean[4];
        boolean[] inputUsed = new boolean[4];

        // Сначала считаем точные совпадения по позициям
        for (int i = 0; i < 4; i++) {
            if (userInput[i] == secretCode[i]) {
                rightDigits++;
                secretUsed[i] = true;
                inputUsed[i] = true;
            }
        }

        // Затем считаем совпадения на других позициях
        for (int i = 0; i < 4; i++) {
            if (inputUsed[i]) continue; // уже учтено как точное совпадение

            for (int j = 0; j < 4; j++) {
                if (secretUsed[j]) continue; // уже использовано

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
        int rightPlaces = 0; // локальная переменная
        for (int i = 0; i < 4; i++) {
            if (userInput[i] == secretCode[i]) {
                rightPlaces++;
            }
        }
        return rightPlaces;
    }

    //check if the user won the game
    public boolean checkWin(){ // сделать публичным
        return checkResult() == 4;
    }

    // Для отладки - получить секретный код
    public int[] getSecretCode() {
        return secretCode.clone();
    }
}