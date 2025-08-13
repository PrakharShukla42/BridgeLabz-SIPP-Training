package Cab;

public class InvoiceService {
    private RideRepository rideRepository;
    private InvoiceCalculator calculator;

    public InvoiceService(RideRepository rideRepository, InvoiceCalculator calculator) {
        this.rideRepository = rideRepository;
        this.calculator = calculator;
    }

    public Invoice getInvoice(String userId) {
        Ride[] rides = rideRepository.getRides(userId);
        if (rides != null && rides.length > 0) {
            return calculator.generateInvoice(rides);
        }
        return null;
    }
}
