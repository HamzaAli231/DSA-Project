package src;
import java.util.Scanner;
public class BookingManagement {
    int bookingId;
    int customerId;
    int pcId;
    int hours;
    Boolean status = true;

    public void setBookingDetails(int bookingId, int customerId, int pcId, int hours, Boolean status) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.pcId = pcId;
        this.hours = hours;
        this.status = status;
    }
    public void createBooking() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Booking ID: ");
        int bookingId = sc.nextInt();

        System.out.print("Enter Customer ID: ");
        int customerId = sc.nextInt();

        System.out.print("Enter PC ID: ");
        int pcId = sc.nextInt();

        System.out.print("Enter Hours: ");
        int hours = sc.nextInt();

        Boolean status = true;
        
        BookingManagement booking = new BookingManagement();
        booking.setBookingDetails(bookingId, customerId, pcId, hours, status);
        System.out.println("Booking created successfully for Booking ID: " + bookingId);
    }
}
