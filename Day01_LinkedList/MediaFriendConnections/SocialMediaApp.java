package Day01_LinkedList.MediaFriendConnections;

public class SocialMediaApp {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();

        sm.addUser(1, "Prakhar", 22);
        sm.addUser(2, "Sakshi", 21);
        sm.addUser(3, "Shivam", 23);
        sm.addUser(4, "Nikhil", 24);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(2, 4);

        sm.displayFriends(1);
        sm.displayFriends(2);

        sm.mutualFriends(1, 2);

        System.out.println("Sakshi has " + sm.countFriends(2) + " friends.");

        sm.removeFriend(1, 2);
        sm.displayFriends(1);
        sm.displayFriends(2);
    }
}