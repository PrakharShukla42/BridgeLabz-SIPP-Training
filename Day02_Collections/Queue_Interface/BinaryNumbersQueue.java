package Day02_Collections.Queue_Interface;

import java.util.*;

public class BinaryNumbersQueue {
    public static void main(String[] args) {
        int N = 5;
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < N; i++) {
            String s = queue.remove();
            System.out.print(s + " ");
            queue.add(s + "0");
            queue.add(s + "1");
        }
    }
}
