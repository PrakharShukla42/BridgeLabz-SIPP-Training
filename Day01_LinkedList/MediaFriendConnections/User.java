package Day01_LinkedList.MediaFriendConnections;

import java.util.ArrayList;
import java.util.List;

public class User {
    int userId, age;
    String name;
    List<Integer> friends;
    User next;

    User(int id, String name, int age) {
        this.userId = id;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}
