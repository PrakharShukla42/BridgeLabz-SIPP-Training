package Constructors;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay = 1500;
    CarRental() {
        this("Unknown", "Sedan", 1);
    }
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }
    void displayDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
    public static void main(String[] args) {
        CarRental rental = new CarRental("Prakhar", "SUV", 5);
        rental.displayDetails();
    }
}
