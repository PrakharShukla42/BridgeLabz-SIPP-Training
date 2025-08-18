package Day02_Stack_Queue_HashSET_HashMAP;

import java.util.*;

class HashMap<K, V> {
    class Node {
        K key;
        V value;
        Node(K key, V value) { this.key = key; this.value = value; }
    }

    private int size = 1000;
    private LinkedList<Node>[] buckets;

    public HashMap() {
        buckets = new LinkedList[size];
        for (int i = 0; i < size; i++) buckets[i] = new LinkedList<>();
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void put(K key, V value) {
        int idx = getIndex(key);
        for (Node node : buckets[idx]) {
            if (node.key.equals(key)) { node.value = value; return; }
        }
        buckets[idx].add(new Node(key, value));
    }

    public V get(K key) {
        int idx = getIndex(key);
        for (Node node : buckets[idx]) {
            if (node.key.equals(key)) return node.value;
        }
        return null;
    }

    public void remove(K key) {
        int idx = getIndex(key);
        Iterator<Node> it = buckets[idx].iterator();
        while (it.hasNext()) {
            if (it.next().key.equals(key)) { it.remove(); return; }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println(map.get("b"));
        map.remove("b");
        System.out.println(map.get("b"));
    }
}
