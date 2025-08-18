package Day04_Linear_BinarySearch;

import java.util.*;

public class ChallengeSearch {
    public static int firstMissingPositive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) if (num > 0) set.add(num);
        for (int i = 1; i <= arr.length + 1; i++) if (!set.contains(i)) return i;
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(arr));
        System.out.println(binarySearch(arr, 4));
    }
}
