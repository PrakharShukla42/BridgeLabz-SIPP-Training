package AbstractClass;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog("Rocky");
        Pet cat = new Cat("Luna");

        Animal dogAnimal = (Animal) dog;
        Animal catAnimal = (Animal) cat;

        dogAnimal.makeSound();
        dogAnimal.sleep();
        dog.play();

        catAnimal.makeSound();
        catAnimal.sleep();
        cat.play();
    }
}
