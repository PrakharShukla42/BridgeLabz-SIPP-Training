public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        Animal myPet = shelter.getAnimal("dog");
        if (myPet != null) {
            System.out.println("My pet says: " + myPet.makeSound());
        }

        myPet = shelter.getAnimal("cat");
        if (myPet != null) {
            System.out.println("Now my pet says: " + myPet.makeSound());
        }
    }
}
