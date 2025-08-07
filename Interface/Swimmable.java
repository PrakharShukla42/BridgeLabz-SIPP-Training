package Interface;

public interface Swimmable {
    void swim();

    default void splash() {
        System.out.println("Splashing in water!"); // Default method 
    }
}
