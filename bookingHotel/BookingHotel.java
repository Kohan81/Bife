package bookingHotel;

/**
 * Created by Eugene
 * create on 27/11/2025
 * Program description:
 */

public class BookingHotel {

    //attributes - instance variables
    private int id;
    private String hotelName;
    private String customerFirstName;
    private String customerLastName;
    private double prise;
    private char newBooking;
    private int countRooms;
    private int typeRoom;

    // static int variable for the count
    private static int countBooking = 0;

                    //----constructors Method -------
    // default constructor
    public BookingHotel() {
    }

    // alternative constructor - with all the properties
    public BookingHotel(int id, String hotelName, String customerFirstName,
                        String customerLastName, double prise, char newBooking, int countRooms, int typeRoom) {
        this.id = id;
        this.hotelName = hotelName;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.prise = prise;
        this.newBooking = newBooking;
        this.countRooms = countRooms;
        this.typeRoom = typeRoom;
    }

    // alternative constructor - with 4 properties
    public BookingHotel(int id, String hotelName, double prise, String customerLastName) {
        this.id = id;
        this.hotelName = hotelName;
        this.prise = prise;
        this.customerLastName = customerLastName;
    }

    //getter (return Method) and setter (void Method)
    // gets and sets for all properties
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public char getNewBooking() {
        return newBooking;
    }

    public void setNewBooking(char newBooking) {
        this.newBooking = newBooking;
    }

    public int getCountRooms() {
        return countRooms;
    }

    public void setCountRooms(int countRooms) {
        this.countRooms = countRooms;
    }
    public int getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(int typeRoom) {
        this.typeRoom = typeRoom;
    }


    // static  getter and setter for count
    public static int getCountBooking() {
        return countBooking;
    }

    public static void setCountBooking(int countBooking) {
        BookingHotel.countBooking = countBooking;
    }

    //methods - user defined methods
    // --string method   toSting  -- print all information about the user input

    @Override
    public String toString() {
        return "\n ============================================================ " +
                "\n                 BookingHotel Information:" +
                "\n    id                        : " + id +
                "\n    hotelName                 :'" + hotelName + '\'' +
                "\n    customerFirstName         :'" + customerFirstName + '\'' +
                "\n    customerLastName          :'" + customerLastName + '\'' +
                "\n    prise                     :" + prise +
                "\n    countRooms                :" + countRooms +
                "\n    rating Hotel is           :" + ratingMessage();
    }

    //-- string method ratingMessage -- testing with if statements
    // (if) the score of the rating is highly, average or poor rated
    public String ratingMessage(){
        if(prise >= 100){
            return "a highly rated!";
        }else if(prise >= 70){
            return "an average rated!";
        }else{
            return "a poor rated!";
        }
    }

    // print result
    void printResult(){
        System.out.println(toString());
    }

    //--static numberOfBooking will count the amount of booking entered
    void printCountOfBooking(){
        System.out.println("There are " + countBooking + " bookings entered.");
    }
}
