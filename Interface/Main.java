package Interface;

public class Main {
    public static void main(String[] args) {
        Flyable flying = new FlyBehavior();
        Swimmable swimming = new SwimBehavior();

        Duck duck = new Duck(flying, swimming);

        duck.performFly();
        duck.performSwim();
        duck.performSplash();
    }
}
