
package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nGaming Cafe Management System:");
            System.out.println("1. Costumer Management");
            System.out.println("2. PC Management");
            System.out.println("3. Booking Management");
            System.out.println("4. Billing and Payment");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                CostumerManagement customerManagement = new CostumerManagement();
                customerManagement.manageCustomers();

            } else if (choice == 2) {
                PCManagement pcManagement = new PCManagement();
                pcManagement.managePCs();

            } else if (choice == 3) {
                BookingManagement bookingManagement = new BookingManagement();
                bookingManagement.BookingMenu();

            } else if (choice == 4) {

                BillingAndPayment billingAndPayment = new BillingAndPayment();
                int billingChoice;

                do {
                    System.out.println(" BILLING AND PAYMENT MENU ");
                    System.out.println("1. Process Billing and Payment");
                    System.out.println("2. Sort Bills by Total Amount");
                    System.out.println("3. Delete Bill by ID");
                    System.out.println("4. Display Payment Status");
                    System.out.println("5. Back to Main Menu");

                    System.out.print("Enter your choice: ");
                    billingChoice = sc.nextInt();

                    if (billingChoice == 1) {
                        billingAndPayment.processBillingAndPayment();

                    } else if (billingChoice == 2) {
                        billingAndPayment.sortBillsByTotalAmount();

                    } else if (billingChoice == 3) {
                        billingAndPayment.deleteBillById();

                    } else if (billingChoice == 4) {
                        billingAndPayment.displayPaymentStatus();

                    } else if (billingChoice == 5) {
                        System.out.println("Returning to Main Menu...");

                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }

                } while (billingChoice != 5);

            } else if (choice == 5) {
                System.out.println("Exiting the system. Goodbye!");

            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
