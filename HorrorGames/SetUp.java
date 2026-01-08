package HorrorGames;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Fedir
 * Created on: 05/01/2026
 * Program description: parent/super class
 */

public class SetUp {
    //attributes - instance variables
    private String userName, password;

    //constructor

    public SetUp() {
    }// default constructor

    public SetUp(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }// alt constructor - with all values

    //getter and setter

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //methods

    public void slowPrint(String text, int delay){
        char[] textChars = text.toCharArray();
        for(int i = 0; i < text.length(); i++){
            System.out.print(textChars[i]);
            try{
                Thread.sleep(delay);
            }/*try*/
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }/*catch*/
        }//for
        System.out.println();
    }//void method - slowPrint

    public void welcomeMessage(){
        String tempText = "Welcome " + userName + " to Multi-horror games";
        slowPrint(tempText, 150);
        slowPrint("This is a collection of horror games:" +
                "\n 1.Killer taxi" +
                "\n 2.Haunted house ",150);
    }//void method - Welcome Message
}//class