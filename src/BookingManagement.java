package src;
import java.util.Scanner;
public class BookingManagement {
    int bookingId;
    int customerId;
    int pcId;
    int hours;
    boolean status = true;
    int count = 0;
    BookingManagement[] bookings = new BookingManagement[1000];

    public void setBookingDetails(int bookingId, int customerId, int pcId, int hours) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.pcId = pcId;
        this.hours = hours;
    }
    public void BookingMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Booking Management:");
            System.out.println("1. Create Booking");
            System.out.println("2. Search Booking");
            System.out.println("3. Display Bookings");
            System.out.println("4. Return to Main Menu");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                createBooking();
            } else if (choice == 2) {
                searchBooking();
            } else if (choice == 3) {
                displayBookings();
            } else if (choice == 4) {
                System.out.println("Return to Main Menu.");
            } else {
                System.out.println("Invalid choice.");
            }
        } while (choice != 4);
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
        
        BookingManagement booking = new BookingManagement();

        booking.setBookingDetails(bookingId, customerId, pcId, hours);
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
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Booking not found.");
        }
    }
    public void displayBookings() {
        System.out.println("Booking List:");
        for (int i = 0; i < count; i++) {
            System.out.println("Booking ID: " + bookings[i].bookingId);
            System.out.println("Customer ID: " + bookings[i].customerId);
            System.out.println("PC ID: " + bookings[i].pcId);
            System.out.println("Hours: " + bookings[i].hours);
        }
    }
}
