package Day01_LinkedList.Ticketbookingsystem;

class Ticket {
    int ticketId;
    String customerName, movieName, seatNo, bookingTime;
    Ticket next;

    Ticket(int id, String cname, String mname, String seat, String time) {
        this.ticketId = id;
        this.customerName = cname;
        this.movieName = mname;
        this.seatNo = seat;
        this.bookingTime = time;
    }
}