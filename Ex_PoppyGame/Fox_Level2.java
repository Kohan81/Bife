package Ex_PoppyGame;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Fedir
 * Created on: 08/12/2025
 * Program description:
 */

public class Fox_Level2 extends GameObjects{

    public Fox_Level2() {
    }

    public Fox_Level2(int move1, int move2) {
        super(move1, move2);
    }

    //************user defined methods (functions)************
    public void move (char choice){
        choice=Character.toLowerCase(choice);
        if (choice=='w')move1++;
        if (choice=='s')move1--;
        if (choice=='a')move2--;
        if (choice=='d')move2++;
    }
}//class
