package Inheritance.HierarchicalInheritance;


class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    void displayCarInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
