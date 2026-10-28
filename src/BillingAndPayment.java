package src;
import java.util.Scanner;
public class BillingAndPayment {
        int billingId;
        int customerId;
        double hourlyRate;
        double hour;
        double totalAmount;
        BillingAndPayment[] bills = new BillingAndPayment[10];
        int count = 0;

    public void Receipt(int billingId, int customerId, double hourlyRate, double hour, double totalAmount) {
        this.billingId = billingId;
        this.customerId = customerId;
        this.hourlyRate = hourlyRate;
        this.hour = hour;
        this.totalAmount = totalAmount;
    }

    public void processBillingAndPayment() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Billing ID: ");
        int billingId = sc.nextInt();

        System.out.print("Enter Customer ID: ");
        int customerId = sc.nextInt();

        System.out.print("Enter Hourly Rate: ");
        double  hourlyRate = sc.nextDouble();

        System.out.print("Enter Hours Used: ");
        double hour = sc.nextDouble();
        double totalAmount = hourlyRate * hour;
        System.out.println("Total Amount to be Paid: " + totalAmount);

        BillingAndPayment receipt = new BillingAndPayment();
        bills[count] = receipt;
        count++;

        receipt.Receipt(billingId, customerId, hourlyRate, hour, totalAmount);
        System.out.println("Payment processed successfully for Billing ID: " + billingId );
        System.out.println("customerId: " + customerId );
        System.out.println("Hourly Rate: " + hourlyRate );
        System.out.println("Hours Used: " + hour );
        System.out.println("Total Amount: " + totalAmount );    
        System.out.println("Total Billing Records: " + count);
    
}
}        