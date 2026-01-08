package SkillsDemo2;

/**
 * Created by Eugene
 * create on 03/12/2025
 * Program description:
 */


/**
 * You must create one class named Movie that models a real-world video game. This class represents a single
 * object and will contain all the fields, constructors and methods.
 */

public class Movie {

    //Attributes (Instance Variables)
    private String title;
    private String director;
    private String genre;
    private int releaseYear;
    private static int movieCount;

    //Static Counter
    public static int numberOfMovies() {
        return movieCount;
    }

    //Constructors
    //A default constructor - Increases movieCount by 1
    public Movie() {
        movieCount++;
    }

    //A full constructor (accepting all fields) - Increase movieCount by 1
    public Movie(String title, String director, String genre, int releaseYear) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseYear = releaseYear;

        movieCount++;
    }


    //Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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

    public static int getMovieCount() {
        return movieCount;
    }

    public static void setMovieCount(int movieCount) {
        Movie.movieCount = movieCount;
    }

    //Create a( Sting return method) toString() method that returns a formatted
    //String containing all the Movie information.

    @Override
    public String toString() {
        return "\n\t\tMovie number " + movieCount  + ":" +
                "\n\ttitle       : '" + title + '\'' +
                "\n\tdirector    : '" + director + '\'' +
                "\n\tgenre       : '" + genre + '\'' +
                "\n\treleaseYear :  " + releaseYear;
    }

}
