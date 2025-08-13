package Cab;

public class User {
    private String userID;
    private Ride[] rides;

    public User(String userID, Ride[] rides) {
        this.userID = userID;
        this.rides = rides;
    }

    public String getUserID() {
        return userID;
    }

    public Ride[] getRides() {
        return rides;
    }

    public void setRides(Ride[] rides) {
        this.rides = rides;
    }
}
