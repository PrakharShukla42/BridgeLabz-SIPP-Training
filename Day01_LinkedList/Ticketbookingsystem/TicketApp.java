package Day01_LinkedList.Ticketbookingsystem;

public class TicketApp {
    public static void main(String[] args) {
        TicketSystem ts = new TicketSystem();

        ts.addTicket(1, "Prakhar", "Inception", "A1", "10:00 AM");
        ts.addTicket(2, "Sakshi", "Interstellar", "B2", "1:00 PM");
        ts.addTicket(3, "Rohit", "The Dark Knight", "C3", "4:00 PM");

        System.out.println("All Tickets:");
        ts.display();

        System.out.println("Total Tickets: " + ts.countTickets());

        ts.removeTicket(2);

        System.out.println("After Removing Ticket 2:");
        ts.display();

        System.out.println("Total Tickets: " + ts.countTickets());
    }
}
