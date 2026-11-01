package src;
import java.util.Scanner;
public class CostumerManagement {
    String CostumerName;
    int CostumerID;
    String CostumerPhone;
    int count = 0;
    CostumerManagement[] customers = new CostumerManagement[10];

    public void Costumer(String CostumerName, int CostumerID, String CostumerPhone) {
        this.CostumerName = CostumerName;
        this.CostumerID = CostumerID;
        this.CostumerPhone = CostumerPhone;
    }

    public void manageCustomers() {
        if (count >= customers.length) {
            System.out.println("Maximum customer records reached. Cannot add more.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cotumer Name: ");
        String CostumerName = sc.nextLine();

        System.out.print("Enter customer ID: ");
        int CostumerID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter customer Phone Number: ");
        String CostumerPhone = sc.nextLine();

        CostumerManagement set_costumer = new CostumerManagement();
        set_costumer.Costumer(CostumerName, CostumerID, CostumerPhone);
        customers[count] = set_costumer;
        count++;

        System.out.println("Costumer Name: " + CostumerName);
        System.out.println("Costumer ID: " + CostumerID);
        System.out.println("Costumer Phone: " + CostumerPhone);
    }
    public static void main(String[] args) {
    }
}
