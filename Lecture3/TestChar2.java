package Lecture3;

/**
 * Created by Eugene
 * create on 03/11/2025
 * Program description:
 */
public class TestChar2 {
    public static void main(String[] args) {

        char char1 = 'E', char2= 'u', char3= 'g', char4= 'e', char5='n', char6= 'e';

        System.out.println("char 1 = " + char1);
        System.out.println("char 2 = " + char2);
        System.out.println("char 3 = " + char3);
        System.out.println("char 4 = " + char4);
        System.out.println("char 5 = " + char5);
        System.out.println("char 6 = " + char6);

        //cast the char to the number on ASCII

        System.out.println("\nchar 1 = " + (int)char1);
        System.out.println("char 2 = " + (int)char2);
        System.out.println("char 3 = " + (int)char3);
        System.out.println("char 4 = " + (int)char4);
        System.out.println("char 5 = " + (int)char5);
        System.out.println("char 6 = " + (int)char6);

        int number=char1+char2+char3+char4;

        System.out.println("\nNumber = " +number);
        System.out.println("Char number is "+ (char)number);
    }
}
