package Inheritance.HierarchicalInheritance;


class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    void displayMotorcycleInfo() {
        System.out.println("Motorcycle Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}
