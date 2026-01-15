package gameXorO;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by Eugene
 * create on 08/01/2026
 * Program description:
 */
public class Game_XorO {
    // methods at the top

    static String[] board;
    static String turn;

    // CheckWinner method will decide the winner

    static String checkWinner() {
        for (int count = 0; count < 8; count++) {
            String line = null;
            switch (count) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }//switch

            if (line.equals("XXX")) {
                return "X";
            }//if (X winner)

            else if (line.equals("OOO")) {
                return "O";

            }//else if ( O winner)
        }// for
        for (int count = 0; count < 9; count++) {
            if (Arrays.asList(board).contains(String.valueOf(count + 1))) {
                break;
            }// if
            else if (count == 8) {
                return "draw";
            }// else
        }//for
        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }//checkWinner

    // To print the board

    static  void printBoard(){
        System.out.println("|---|---|---|");
        System.out.println("| "+board[0] + " | " + board[1] +" | " +board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| "+board[3] + " | " + board[4] + " | " +board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| "+board[6] + " | " + board[7] + " | " +board[8] + " |");
        System.out.println("|---|---|---|");
    }//printBoard


    // main method
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        for (int count = 0; count <9; count++){
            board[count] = String.valueOf((count + 1));
        }//for

        System.out.println("Welcome to 3x3 X and O's");
        printBoard();
        System.out.println("X will play first. Enter a slot to place X in:");

        while (winner==null){
            int numInput;
            try {
                numInput = keyboard.nextInt();
                // check range
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }//if
                // check if slot is available
                if (board[numInput - 1].equals(String.valueOf(numInput))) {
                    board[numInput - 1] = turn;

                    //Toggle turn
                    turn = turn.equals("X") ? "O" : "X";

                    printBoard();
                    winner = checkWinner();
                }// if
                else {
                    System.out.println("Slot already taken; re-enter slot number");
                }// else
            } catch (InputMismatchException e){
                System.out.println("Invalid input; re-enter slot number");
                keyboard.nextLine();
            } //catch
        }//while

        // final results

        if(winner.equalsIgnoreCase("draw")){
            System.out.println("It's a draw! thanks for playing.");
        }//if
        else {
            System.out.println("Congratulations! " + winner + " 's has won!\nThanks for playing.");
        }// else
    }//main


}//class