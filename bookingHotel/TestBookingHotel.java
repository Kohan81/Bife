package bookingHotel;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Eugene
 * create on 27/11/2025
 * Program description:
 */

public class TestBookingHotel {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        char answer;
        System.out.println("Hello in the booking hotels App!");

        int countOfNights;

        do {
            System.out.print("Do you want to book a hotel? (y/n)");
            answer = keyboard.next().charAt(0);

            if (answer == 'y'){
                BookingHotel bookingHotel = new BookingHotel();

                System.out.println();
                System.out.print("Please enter your first name: ");
                bookingHotel.setCustomerFirstName(keyboard.next());

                System.out.println();
                System.out.print("Please enter your last name: ");
                bookingHotel.setCustomerLastName(keyboard.next());

                System.out.println();
                System.out.print("Please enter the hotel name: ");
                bookingHotel.setHotelName(keyboard.next());

                System.out.println();
                System.out.print("Please enter the room type: ");
                bookingHotel.setTypeRoom(keyboard.nextInt());

                System.out.println();
                System.out.print("Please enter the number of rooms: ");
                bookingHotel.setCountRooms(keyboard.nextInt());

                System.out.println();
                System.out.print("Please enter the room price in € (double format): ");
                bookingHotel.setPrise(keyboard.nextDouble());

                System.out.println();
                System.out.print("Please enter the number of nights: ");
                countOfNights = keyboard.nextInt();

                System.out.println();
                System.out.print("You order is: ");
                bookingHotel.printResult();
                System.out.println(" ============================================================ ");
                System.out.println("\t\tTotal prise is: " + df.format(bookingHotel.getPrise() * countOfNights) + " €");
                System.out.println();
                System.out.println("Do you confirm the order? (y/n)");
                bookingHotel.setNewBooking(keyboard.next().charAt(0));
                if (bookingHotel.getNewBooking() == 'y') {
                    System.out.println("Thank you for your order!");
                    BookingHotel.setCountBooking(BookingHotel.getCountBooking() + 1);
                    bookingHotel.printCountOfBooking();
                }

            } else if (answer == 'n')System.out.println("Thank you for visiting us. Goodbye!");

        } while (answer == 'y');
    }
}
