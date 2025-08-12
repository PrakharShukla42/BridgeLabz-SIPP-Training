package Inheritance.HierarchicalInheritance;


public class Main {
    public static void main(String[] args) {
        Car car = new Car("Fortuner", 2022, 4);
        Motorcycle motorcycle = new Motorcycle("Bullet 350", 2021, false);

        car.displayCarInfo();
        System.out.println();
        motorcycle.displayMotorcycleInfo();
    }
}
