package vidioGame;

/**
 * Created by Eugene
 * create on 26/11/2025
 * Program description:
 */

public class VideoGame1 {

    //-------------------------------attributes - instance variables------------------------
    private int id;              // A unique number to identify the game
    private String title;        // Name/title of the game (e.g. "Minecraft")
    private String platform;     // Platform (e.g. "PC", "PS5", "Switch")
    private String genre;        // Genre (e.g. "Action", "Sports", "RPG")
    private int releaseYear;     // Year the game was released (e.g. 2015)
    private double rating;       // Rating out of 10 (e.g. 8.5)
    private double price;        // Price of the game (e.g. 29.99)

    // static int variable for the count - static means this variable
    //                                     belong to the CLASS not to the object
    private static int count = 0;   // Starts at 0, increases each time we make a new game

    //-------------------------constructors Method --------------------------------------
    public VideoGame1() {
        count++; // increase the static counter everytime a new game is created
    }//default constructor - (No parameter) empty

    public VideoGame1(int id, String title, String platform, String genre, int releaseYear, double rating, double price) {
        this.id = id;
        this.title = title;
        this.platform = platform;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.price = price;
        count++; // increase the static counter everytime a new game is created
    }// alternative constructor - with all the properties

    public VideoGame1(int id, String title, double rating, double price) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.price = price;
        count++; // increase the static counter everytime a new game is created
    }// alternative constructor - with 4 properties

    //getter (return Method) and setter (void Method)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        VideoGame1.count = count; //VideoGame.count refer to the static class variable above
    }

    //-----------------------------methods - user defined methods----------------
    // --string method   toSting  -- print all information about the user input

    @Override
    public String toString() {
        return "\n        Video Game Info" +
                "\n================================" +
                "\nID           : " + id +
                "\nTitle        : " + title +
                "\nPlatform     : " + platform +
                "\nGenre        : " + genre +
                "\nRelease Year : " + releaseYear +
                "\nRating       : " + rating +
                "\nPrice        : " + price +
                "\n================================";
    }//toString -  printOut the result or users input or object created
    //-----------------------------------------------------------------------------
    //-- string method ratingMessage -- testing with if statements
    // (if) the score of the rating is highly, average or poor rate
    public String ratingMessage(){
        if(rating >= 8){
            return "This game is highly rated!";
        }//if
        else if (rating>=5) {
            return "This game has an average rating!";
        } //  else if
        else {
            return "This game has a poor rating!";
        }//else
    }//ratingMessage
    //-----------------------------------------------------------------------------

    //--static numberOfGame will count the number of games entered
    public static int numberOfGames(){
        return  count;//returns how many objects have been created
        // and return a value in count
    }//


}//class