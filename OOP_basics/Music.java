package OOP_basics;

/**
 * Created by Eugene
 * create on 06/11/2025
 * Program description:
 */
public class Music {
     //attributes or properties
    String instrumentType;
    int instrumentAge;

    public Music() {
        System.out.println("I am a default constructor, I have no values");
        System.out.println("_____________________ 0 values");
    } //default constructor

    public Music(String instrumentType , int instrumentAge) {
        this.instrumentType = instrumentType;
        this.instrumentAge = instrumentAge;
        System.out.println("_____________________ 2 values");
        System.out.println("I am an alternate constructor, I have instrument " + instrumentType);
        System.out.println("Age: " + instrumentAge);
    }//alternate constructor

    public Music(String instrumentType) {
        this.instrumentType = instrumentType;
        System.out.println("_____________________ 1 value");
        System.out.println("I am an alternate constructor, I have instrument " + instrumentType);
    }//alternate constructor
}
