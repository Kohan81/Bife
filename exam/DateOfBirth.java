package exam;

/**
 * Created by Eugene
 * create on 11/12/2025
 * Program description:
 */

/*
Create a programme that will read in information given by the
user and then print out their date of birth.

Ensure that you use clear outputs and inputs.
 */

    //1. Create a class called DateOfBirth
public class DateOfBirth {

    //2. Includes four pieces of information as instance variables –
    //name(String) month(int) day(int) year(int).

    private String name;
    private int month;
    private int day;
    private int year;

    //3. Your class should have a
    // 1) default constructor,

    DateOfBirth(){}
    // 2) an alternative constructor that initializes the all instance variables
    DateOfBirth(String name, int month, int day, int year){
        this.name = name;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    //4. Provide a set and a get method for each instance variable.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //5. Provide a method displayDOB() which will print out all the information

    @Override
    public String toString() {
        return "\n\t\tDateOfBirth" +
                " \n\t********************" +
                "\n\tname   =  '" + name + '\'' +
                "\n\tmonth  =   " + month +
                "\n\tday    =   " + day +
                "\n\tyear   =   " + year;
    }

    void displayDOB(){
        System.out.println(this);
    }


}
