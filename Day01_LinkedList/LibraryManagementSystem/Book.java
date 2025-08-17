package Day01_LinkedList.LibraryManagementSystem;

public class Book {
    String title, author, genre;
    int bookId;
    boolean available;
    Book prev, next;

    Book(int id, String title, String author, String genre, boolean avail) {
        this.bookId = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = avail;
        this.prev = null;
        this.next = null;
    }
}
