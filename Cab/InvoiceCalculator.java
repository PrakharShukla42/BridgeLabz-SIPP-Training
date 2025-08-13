package Cab;

public class InvoiceCalculator {
    private static final double RATE_PER_KM = 10.0;
    private static final double RATE_PER_MIN = 1.0;

    public double calculateFare(double distance, double time) {
        return (distance * RATE_PER_KM) + (time * RATE_PER_MIN);
    }

    public double calculateFare(Ride ride) {
        return calculateFare(ride.getDistance(), ride.getTime());
    }

    public double calculateTotalFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += calculateFare(ride);
        }
        return totalFare;
    }

    public Invoice generateInvoice(Ride[] rides) {
        double totalFare = calculateTotalFare(rides);
        return new Invoice(rides.length, totalFare);
    }
}
