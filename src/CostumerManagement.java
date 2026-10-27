package src;
import java.util.Scanner;
public class CostumerManagement {
    public void manageCustomers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cotumer Name: ");
        String CostumerName = sc.nextLine();

        System.out.print("Enter customer ID: ");
        int CostumerID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter customer Phone Number: ");
        String CostumerPhone = sc.nextLine();


        Costumer costumer = new Costumer(CostumerName, CostumerID, CostumerPhone);

        System.out.println("Costumer Name: " + costumer.CostumerName);
        System.out.println("Costumer ID: " + costumer.CostumerID);
        System.out.println("Costumer Phone: " + costumer.CostumerPhone);
        
    }
    public static void main(String[] args) {
        
    }
}
