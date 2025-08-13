package Cab;

public class RideRepository {
    private User[] users;

    public RideRepository(User[] users) {
        this.users = users;
    }

    public Ride[] getRides(String userID) {
        for (User user : users) {
            if (user.getUserID().equals(userID)) {
                return user.getRides();
            }
        }
        return new Ride[0]; 
    }
}
