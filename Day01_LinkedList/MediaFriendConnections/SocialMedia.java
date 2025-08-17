package Day01_LinkedList.MediaFriendConnections;

import java.util.HashSet;
import java.util.Set;

public class SocialMedia {
    User head;

    void addUser(int id, String name, int age) {
        User newUser = new User(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    User findUser(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    void addFriend(int id1, int id2) {
        User u1 = findUser(id1), u2 = findUser(id2);
        if (u1 != null && u2 != null) {
            if (!u1.friends.contains(id2)) u1.friends.add(id2);
            if (!u2.friends.contains(id1)) u2.friends.add(id1);
        }
    }

    void removeFriend(int id1, int id2) {
        User u1 = findUser(id1), u2 = findUser(id2);
        if (u1 != null && u2 != null) {
            u1.friends.remove((Integer) id2);
            u2.friends.remove((Integer) id1);
        }
    }

    void mutualFriends(int id1, int id2) {
        User u1 = findUser(id1), u2 = findUser(id2);
        if (u1 == null || u2 == null) return;
        Set<Integer> set = new HashSet<>(u1.friends);
        set.retainAll(u2.friends);
        System.out.println("Mutual Friends between " + u1.name + " and " + u2.name + ": " + set);
    }

    void displayFriends(int id) {
        User u = findUser(id);
        if (u != null) {
            System.out.println("Friends of " + u.name + ": " + u.friends);
        }
    }

    int countFriends(int id) {
        User u = findUser(id);
        return (u != null) ? u.friends.size() : 0;
    }
}
