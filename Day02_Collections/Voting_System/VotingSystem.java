package Day02_Collections.Voting_System;

import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        // Simulate votes
        List<String> votes = Arrays.asList(
            "Rahul", "Sakshi", "Rahul", "Priya", "Sakshi", "Rahul"
        );

        // 1️⃣ Count votes using HashMap
        Map<String, Integer> voteCount = new HashMap<>();
        for (String v : votes) {
            voteCount.put(v, voteCount.getOrDefault(v, 0) + 1);
        }
        System.out.println("Vote Count (HashMap, unordered):");
        System.out.println(voteCount);

        // 2️⃣ Display votes in sorted order using TreeMap
        Map<String, Integer> sortedVotes = new TreeMap<>(voteCount);
        System.out.println("\nVote Count (TreeMap, sorted by candidate):");
        System.out.println(sortedVotes);

        // 3️⃣ Maintain insertion order using LinkedHashMap
        Map<String, Integer> linkedVotes = new LinkedHashMap<>();
        for (String v : votes) {
            linkedVotes.put(v, linkedVotes.getOrDefault(v, 0) + 1);
        }
        System.out.println("\nVote Count (LinkedHashMap, insertion order):");
        System.out.println(linkedVotes);

        // 4️⃣ Find the winner (candidate with max votes)
        String winner = Collections.max(voteCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("\nWinner: " + winner);
    }
}
