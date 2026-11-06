package src;
import java.util.Scanner;
public class CostumerManagement {
    String CostumerName;
    int CostumerID;
    String CostumerPhone;
    int count = 0;
    CostumerManagement[] customers = new CostumerManagement[1000];

public void manageCustomers() {
    Scanner sc = new Scanner(System.in);
    int choice;

    do {
        System.out.println("Customer Management:");
        System.out.println("1. Add Customer");
        System.out.println("2. Search Customer");
        System.out.println("3. Display Customers");
        System.out.println("4. Return to Main Menu");
        System.out.print("Enter your choice: ");

        choice = sc.nextInt();

        if (choice == 1) {
            AddCustomer();
        }
        else if (choice == 2) {
            searchCustomers();
        }
        else if (choice == 3) {
            DisplayCustumers();
        }
        else if (choice == 4) {
            System.out.println("Return to Main Menu.");
        }
        else {
            System.out.println("Invalid choice.");
        }

    } while (choice != 4);
    }

    public void setCostumerManagement(String CostumerName, int CostumerID, String CostumerPhone) {
        this.CostumerName = CostumerName;
        this.CostumerID = CostumerID;
        this.CostumerPhone = CostumerPhone;
    }

    public void AddCustomer() {
        if (count >= customers.length) {
            System.out.println("Maximum customer records reached. Cannot add more.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String CostumerName = sc.nextLine();

        System.out.print("Enter customer ID: ");
        int CostumerID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter customer Phone Number: ");
        String CostumerPhone = sc.nextLine();

        CostumerManagement set_costumer = new CostumerManagement();
        set_costumer.setCostumerManagement(CostumerName, CostumerID, CostumerPhone);
        customers[count] = set_costumer;
        count++;

        System.out.println("Costumer Name: " + CostumerName);
        System.out.println("Costumer ID: " + CostumerID);
        System.out.println("Costumer Phone: " + CostumerPhone);
    }

    boolean found = false;
    public void searchCustomers() {
        System.out.print("Enter Customer ID to search: ");
        Scanner sc = new Scanner(System.in);
        int searchID  = sc.nextInt();
        
        int start = 0;
        int end = count-1;

        while (start <= end){
            int mid = (start + end)/2;
            if (customers[mid].CostumerID ==  searchID){
                System.out.println("Customer Found:");
                System.out.println("Costumer Name: " + customers[mid].CostumerName);
                System.out.println("Costumer ID: " + customers[mid].CostumerID);
                System.out.println("Costumer Phone: " + customers[mid].CostumerPhone);
                found = true;
                break;
            }
            else if(customers[mid].CostumerID > searchID){
                end = mid-1;

            }
            else{
                start = mid+1;
            }
        }
        if (!found) {
            System.out.println("Customer not found. Invalid ID");
        }
    }
    public void DisplayCustumers(){
        System.out.println("Customer List:");
        for(int i = 0; i < count; i++){
            System.out.println("Costumer Name: " + customers[i].CostumerName);
            System.out.println("Costumer ID: " + customers[i].CostumerID);
            System.out.println("Costumer Phone: " + customers[i].CostumerPhone);
        }
    }
}
