package src;
import java.util.Scanner;
public class BookingManagement {
    int bookingId;
    int customerId;
    int pcId;
    int hours;
    boolean status = true;
    int count = 0;
    BookingManagement[] bookings = new BookingManagement[10];

    public void setBookingDetails(int bookingId, int customerId, int pcId, int hours, boolean status) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.pcId = pcId;
        this.hours = hours;
        this.status = status;
    }
    public void createBooking() {
        if (count >= bookings.length) {
            System.out.println("Maximum booking records reached. Cannot create more.");
            return;
        }
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
        bookings[count] = booking;
        count++;
    }
    public void searchBooking() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Booking ID to search: ");
        int bookingId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (bookings[i].bookingId == bookingId) {
                System.out.println("Booking found:");
                System.out.println("Booking ID: " + bookings[i].bookingId);
                System.out.println("Customer ID: " + bookings[i].customerId);
                System.out.println("PC ID: " + bookings[i].pcId);
                System.out.println("Hours: " + bookings[i].hours);
                System.out.println("Status: " + (bookings[i].status));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Booking not found.");
        }
    }
}
