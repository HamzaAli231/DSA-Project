package src;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Gaming Cafe Management System:");
            System.out.println("1. Costumer Management");
            System.out.println("2. PC Management");
            System.out.println("3. Booking Management");
            System.out.println("4. Billing and Payment");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if (choice == 1){
                CostumerManagement customerManagement = new CostumerManagement();
                customerManagement.manageCustomers();
            }else if (choice == 2){
                PCManagement pcManagement = new PCManagement();
                pcManagement.managePCs();
            }else if (choice == 3){
                    BookingManagement bookingManagement = new BookingManagement();
                    bookingManagement.manageBookings();
            }else if (choice == 4){
                    BillingAndPayment billingAndPayment = new BillingAndPayment();
                    billingAndPayment.processBillingAndPayment();
            }else if (choice == 5){
                    System.out.println("Exiting the system. Goodbye!");
            }else{
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice != 5);
        sc.close();
    }
}
