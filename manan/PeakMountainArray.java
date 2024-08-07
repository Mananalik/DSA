package manan;

public class PeakMountainArray {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 5, 3, 2, 1};
        System.out.println(findPeakInMountainArray(arr));

    }

    static int findPeakInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

}
