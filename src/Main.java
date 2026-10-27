package src;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Gaming Cafe Management System");
            System.out.println("1. Costumer Management");
            System.out.println("2. PC Management");
            System.out.println("3. Booking Management");
            System.out.println("4. Billing and Payment");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    CostumerManagement customerManagement = new CostumerManagement();
                    customerManagement.manageCustomers();
                    break;
                case 2:
                    PCManagement pcManagement = new PCManagement();
                    pcManagement.managePCs();
                    break;
                case 3:
                    BookingManagement bookingManagement = new BookingManagement();
                    bookingManagement.manageBookings();
                    break;
                case 4:
                    BillingAndPayment billingAndPayment = new BillingAndPayment();
                    billingAndPayment.processBillingAndPayment();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice != 5);
        sc.close();
    }
}
