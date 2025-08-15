package AbstractClass;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public abstract void makeSound(); // force child classes to implement
}
