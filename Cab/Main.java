package Cab;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("user1", new Ride[]{
                new Ride(2, 5),
                new Ride(3, 8)
        });

        User user2 = new User("user2", new Ride[]{
                new Ride(3, 8),
                new Ride(4, 9),
                new Ride(6, 15)
        });

        RideRepository rideRepository = new RideRepository(new User[]{user1, user2});

        InvoiceCalculator calculator = new InvoiceCalculator();
        InvoiceService service = new InvoiceService(rideRepository, calculator);

        Invoice invoice1 = service.getInvoice("user1");
        if (invoice1 != null) {
            System.out.println("----INVOICE OF USER1------");
            invoice1.printInvoice();
        }

        Invoice invoice2 = service.getInvoice("user2");
        if (invoice2 != null) {
            System.out.println("----INVOICE OF USER2------");
            invoice2.printInvoice();
        }
    }
}


//        -----------------STEP3-------------------------------
//        InnvoiceCalculator calculator = new InnvoiceCalculator();
//        Ride[] rides = {
//                new Ride(2,5),
//                new Ride(10,50),
//                new Ride(0.5,1)
//        };
//
//        Invoice invoice = calculator.generateInvoice(rides);
//        invoice.printInvoice();

//        -------------------STEP2--------------------
//        double total = calculator.CalculateTotalFare(rides);
//        System.out.println(total);



//        -----------------STEP 1------------------------
//        double fare = calculator.CalculateFare(2.0, 5);
//        System.out.println("Before Overidiing");
//        System.out.println(fare);
//        Ride ride = new Ride(2.0, 5, fare);
//        System.out.println("After Overriding");
//        System.out.println(calculator.CalculateFare(ride));
