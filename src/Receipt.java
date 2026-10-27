package src;

public class Receipt {
     int billingId;
        int customerId;
        double hourlyRate;
        double hour;
        double totalAmount;

    public Receipt(int billingId, int customerId, double hourlyRate, double hour, double totalAmount) {
        this.billingId = billingId;
        this.customerId = customerId;
        this.hourlyRate = hourlyRate;
        this.hour = hour;
        this.totalAmount = totalAmount;
    }
}
