package Day01_LinkedList.Ticketbookingsystem;

class TicketSystem {
    Ticket head;

    void addTicket(int id, String cname, String mname, String seat, String time) {
        Ticket newNode = new Ticket(id, cname, mname, seat, time);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Ticket temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    void removeTicket(int id) {
        if (head == null) return;
        Ticket curr = head, prev = null;
        do {
            if (curr.ticketId == id) {
                if (prev != null) prev.next = curr.next;
                else {
                    Ticket temp = head;
                    while (temp.next != head) temp = temp.next;
                    head = head.next;
                    temp.next = head;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    void display() {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNo);
            temp = temp.next;
        } while (temp != head);
    }

    int countTickets() {
        if (head == null) return 0;
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}