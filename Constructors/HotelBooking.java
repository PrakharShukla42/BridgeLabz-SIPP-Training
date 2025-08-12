package Constructors;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    HotelBooking() {
        this("Unknown Guest", "Standard", 1);
    }
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    void displayDetails() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Prakhar", "Deluxe", 3);
        HotelBooking booking3 = new HotelBooking(booking2);
        booking1.displayDetails();
        booking2.displayDetails();
        booking3.displayDetails();
    }
}
