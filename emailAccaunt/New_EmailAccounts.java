package emailAccaunt;

/**
 * Created by Eugene
 * create on 01/12/2025
 * Program description:
 */

// To do List
//attributes - instance variables
//*email
// email year / first letter of name / lastname/.bife@wicklowvec.ie
//*course
//*password
//*firstName, lastName
//*passwordLength
//*emailSuffix= @wicklowvec.ie
//*collegeName

//* Static countEmail

//constructor
//default constructor
//constructor - all properties

//getter and setter for all properties

//===========================  methods ===========================

// set college{}
// randomPassword{}
//return method  - for getting all the information - toString


//Sting method to return bedroom type


//static numberOfEmails will count the number of booking entered


public class New_EmailAccounts {
// To do List
    //========================== attributes ==========================

    private String emailSuffix = "@wicklowvec.ie";
    private String email, firstName, LastName, password, collegeName;
    private int year;
    private int defaultPasswordLength = 10;

    private static int countEmail = 0;


    //======================= constructor =================


    public New_EmailAccounts() {
        countEmail++;
    } //default constructor

    public New_EmailAccounts(int year, String firstName, String lastName, String collegeName) {

        this.firstName = firstName;
        this.LastName = lastName;
        this.collegeName = collegeName;
        this.year = year;

        countEmail++;
    }

    public String toString() {
        return "New_EmailAccounts{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", year=" + year +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        New_EmailAccounts em1 = new New_EmailAccounts (25,"Ciara","Duffin", "Bray");
        System.out.println(em1.toString());

    }//main
}//class