package Day04_Linear_BinarySearch;

public class PeakElement {
    public static int findPeak(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] < arr[mid + 1]) l = mid + 1;
            else r = mid;
        }
        return arr[l];
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        System.out.println(findPeak(arr));
    }
}
