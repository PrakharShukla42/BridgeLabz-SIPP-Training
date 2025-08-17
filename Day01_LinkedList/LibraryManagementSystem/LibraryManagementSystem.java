package Day01_LinkedList.LibraryManagementSystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(1, "1984", "George Orwell", "Dystopian", true);
        lib.addBook(2, "The Alchemist", "Paulo Coelho", "Fiction", true);
        lib.addBook(3, "To Kill a Mockingbird", "Harper Lee", "Classic", true);

        System.out.println("Books (Forward):");
        lib.displayForward();

        System.out.println("\nBooks (Reverse):");
        lib.displayReverse();

        System.out.println("\nTotal Books: " + lib.countBooks());

        lib.updateStatus(2, false);
        System.out.println("\nAfter issuing 'The Alchemist':");
        lib.displayForward();

        lib.removeBook(1);
        System.out.println("\nAfter removing '1984':");
        lib.displayForward();
    }
}
