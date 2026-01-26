package GuessTheCodeNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Eugene
 * create on 08/01/2026
 * Program description:
 */

public class CodeGenerator {

    //Generate 4-digits cod like an int array

    public static int[] generateCodeAsArray() {
        // Create a list with 10 digits
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            digits.add(i);
        }

        // shuffle digits
        Collections.shuffle(digits);

        // take just the first 4 digits
        //and collect them in the result array
        int[] code = new int[4];
        for (int i = 0; i < 4; i++) {
            code[i] = digits.get(i);
        }

        return code;
    }
}