package Cab;

public class Invoice {
    private int totalRides;
    private double totalFare;

    public Invoice(int totalRides, double totalFare) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
    }

    public void printInvoice() {
        System.out.println("Total rides: " + totalRides);
        System.out.println("Total fare: " + totalFare);
        System.out.println("Average fare per ride: " + (totalFare / totalRides));
    }
}
