package Lab5_Loops;

/**
 * Created by: Fedor
 * Created on: 06/10/2025
 * Program description:
 */
public class testAllChars {
    static void main(String[] args) {
        int chars=0, count=0;
        for (int i=0; i<=1000; i++){
            System.out.print((char)chars + " ");
            if ((i%2)!=1){
                count++;
                if ((count%2)!=1){
                    System.out.print("\n");
                }//if
            }//if
            chars++;
        }//for
    }//main

}//class
