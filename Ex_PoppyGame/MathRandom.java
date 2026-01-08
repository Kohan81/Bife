package MathRandom;

/**
 * Created by: Fedir
 * Created on: 08/11/2025
 * Program description: pre-declaring math.random class for easier using in the future.
 */

public class MathRandom {
    private int minNumber, maxNumber; //min number for minimal random generated number
    // and max number for maximal number

    public double MathRandom(){
        return(double)(Math.random());
    }//default construction

    public int MathRandom(int maximalRandomNumber){
        maxNumber = maximalRandomNumber;
        return (int) ((Math.random()*maxNumber)+1);
    }//mathRandom, when only max number declared

    public int MathRandom(int minimalRandomNumber, int maximalRandomNumber){
        maxNumber = maximalRandomNumber;
        minNumber = minimalRandomNumber;
        return (int) ((Math.random()*(maxNumber-minNumber+1))+minNumber);
    }//mathRandom, when both options declared
}//class
