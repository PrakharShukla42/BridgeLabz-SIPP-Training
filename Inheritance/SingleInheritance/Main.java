package Inheritance.SingleInheritance;


public class Main {
    public static void main(String[] args) {
        Author author = new Author(
            "Java Programming",
            2023,
            "James Gosling",
            "Canadian computer scientist, known as the father of Java."
        );
        author.displayInfo();
    }
}
