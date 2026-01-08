package Ex_PoppyGame;

/**
 * Created by: Fedir
 * Created on: 04/12/2025
 * Program description:
 */

public class Puppy_Level1 extends GameObjects{
    //************attributes************
    String puppyName; //belongs only to the Puppy class
    //************Constructor************
    public Puppy_Level1() {
    }//default constructor with no values / empty object

    public Puppy_Level1(int move1, int move2, String puppyName){
        super (move1, move2);
        this.puppyName=puppyName;
    }//inheriting from the super and using the attribute from this class
    //(object - int, int, string)

    public Puppy_Level1(int move1, int move2){
        super (move1, move2);
    }//inheriting from the super
    //(object - int, int, string)

    //************get and set method ************
    public String getPuppyName() {
        return puppyName;
    }

    public void setPuppyName(String puppyName) {
        this.puppyName = puppyName;
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
