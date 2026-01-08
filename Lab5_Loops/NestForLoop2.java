package Lab5_Loops;


/**
 * Created by: Fedir
 * Created on: 16/10/2025
 * Program description:
 */
public class NestForLoop2 {
    static void main(String[] args) {
        for (int row=3; row<=6; row++){
            for(int column=1; column <=4; column++) {
                System.out.print("\t" +(row*column));
            }//for column
            System.out.println();
        }//for row

    }//main

}//class
