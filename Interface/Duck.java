package Interface;

public class Duck {
    private Flyable flyBehavior;
    private Swimmable swimBehavior;

    public Duck(Flyable flyBehavior, Swimmable swimBehavior) {
        this.flyBehavior = flyBehavior;
        this.swimBehavior = swimBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public void performSplash() {
        swimBehavior.splash(); // Calls default method
    }
}
