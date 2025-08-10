package Day5_Methods;

import java.util.Scanner;

public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }
        for (int age : ages) {
            System.out.println(canStudentVote(age) ? "Can Vote" : "Cannot Vote");
        }
        sc.close();
    }
}
