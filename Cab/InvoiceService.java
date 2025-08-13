package Cab;

public class InvoiceService {
    private RideRepository rideRepository;
    private InnvoiceCalculator Calculator;

    public InvoiceService(RideRepository rideRepository, InnvoiceCalculator Calculator) {
        this.rideRepository = rideRepository;
        this.Calculator = Calculator;
    }

    public Invoice getInvoice(String userId) {
        Ride[] rides = rideRepository.getRides(userId);
        if(rides != null && rides.length > 0) {
            return Calculator.generateInvoice(rides);
        }
        else{
            return null;
        }
    }
}
