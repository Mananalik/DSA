package manan;

public class RecursionPratice {
    public static void main(String args[]) {
//        int n = 6;
//        System.out.println(fibo(n));
//        int [] arr = {1,2,3,4,55,66,78};
//        int target = 55;
//        System.out.println(binarySearch(arr,target,0,arr.length-1));
        System.out.println(fiboFormula(6));
    }

    // fibonacci series
    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    // Binary Search
    static int binarySearch(int[] arr, int target, int s, int e) {
        if (s>e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[m] > target) {
            return binarySearch(arr, target, s, m - 1);
        }
        return binarySearch(arr, target, m + 1, e);
    }
    static int fiboFormula(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}


