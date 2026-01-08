package vidioGame;

/**
 * Created by Eugene
 * create on 26/11/2025
 * Program description:
 */

//attributes - instance variables

// static int variable for the count

//----constructors Method -------
// default constructor
// alternative constructor - with all the properties
// alternative constructor - with 4 properties

//getter (return Method) and setter (void Method)
// gets and sets for all properties
// static getter and setter for count

//methods - user defined methods
// --string method   toSting  -- print all information about the user input
//-- string method ratingMessage -- testing with if statements
// (if) the score of the rating is highly, average or poor rated
// print result
//--static numberOfGame will count the number of games entered

public class MyVideoGame {

    // static int variable for the count
    private String gameName; //what is the game's name
    private String platform; //what platform use for this game
    private String genre; //any genre of the game
    private int releaseYear; //game release year
    private double rating; //game rating from 1 to 10
    private double price; //game price in €, from 1 to 1000
    private String ratingMessage;
    private String id = "";

    // static int variable for the count
    static int numberOfGames = 0;

    //----constructors Method -------
    // default constructor
    public MyVideoGame() {
    }

    // alternative constructor - with all the properties
    public MyVideoGame(String gameName, String platform, String genre, int releaseYear, int rating, double price) {
        this.gameName = gameName;
        this.platform = platform;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.price = price;
    }

    // alternative constructor - with 4 properties
    public MyVideoGame(String gameName, String genre, int rating, double price) {
        this.gameName = gameName;
        this.genre = genre;
        this.rating = rating;
        this.price = price;
    }

    //getter (return Method) and setter (void Method)
    // gets and sets for all properties


    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        if (releaseYear < 0) {
            releaseYear = 0;
        }
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
        ratingMessage();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getNumberOfGames() {
        return numberOfGames;
    }

    public static void setNumberOfGames(int numberOfGames) {
        MyVideoGame.numberOfGames = numberOfGames;
    }

    //methods - user defined methods
    // --string method   toSting  -- print all information about the user input

    @Override
    public String toString() {
        return  " \t====================================== " +
                "\n\t          VideoGame Info:  " +
                "\n\t -------------------------------------- " +
                "\n\t  ID is           :\t '"+ makeID() + "'" +
                "\n\t  gameName        :\t'" + gameName + '\'' +
                "\n\t  platform        :\t'" + platform + '\'' +
                "\n\t  genre           :\t'" + genre + '\'' +
                "\n\t  releaseYear     :\t " + releaseYear +
                "\n\t  rating is       :\t'" + ratingMessage + '\'' +
                "\n\t  rating          :\t " + rating +
                "\n\t  price           :\t " + price + " € " +
                "\n\t========================================= ";
    }

    //-- string method ratingMessage -- testing with if statements
    // (if) the score of the rating is highly, average or poor rated

    void ratingMessage(){
        if(rating >= 8){
            ratingMessage = "a highly rated!".toUpperCase();
        }else if(rating >= 5){
            ratingMessage = "an good rating!".toUpperCase();
        }else{
            ratingMessage = "a poor rating!".toUpperCase();
        }
    }

    String makeID(){
        if (gameName == null || gameName.isEmpty()) {
            id = "NNG";                                         //no name game
        }else for (int i = 0; i < 2; i++) {
                    id += gameName.charAt(i);
        }
        if (releaseYear > 0 & releaseYear > 999){
            id += releaseYear % 100;
        }
        return id;
    }

    // print result
    //--static numberOfGame will count the number of games entered

    static void printResult(){
        System.out.println("There are " + numberOfGames + " games entered.");
    }
}
