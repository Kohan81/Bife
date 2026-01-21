package GuessTheCodeNumber.Logic;

import GuessTheCodeNumber.Visual;

/**
 * Created by Eugene
 * create on 08/01/2026
 * Program description:
 */
// Class for filtering input

public class DigitFilter {

    // checking that user input just 4 digits
    public boolean isFourDigits(String input) {
        if (input == null) return false;
        input = input.trim();
        return input.matches("\\d{4}");
    }

    // checking that user input just 4 digits
    // and converting it to the int array
    public int[] toIntArray(String input) {
        if (!isFourDigits(input)) return null;

        int[] code = new int[4];
        for (int i = 0; i < 4; i++) {
            code[i] = input.charAt(i);
        }
        return code;
    }

    public boolean hasNoRepeatedDigits(String input) {

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    return false; // repeated digit
                }
            }
        }
        return true; // no repeated digits
    }

}