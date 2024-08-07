package manan;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,55,77,88,99};
        int num = 55;
        System.out.println(linearSearch(arr,num));

    }

    static int linearSearch(int[] arr, int num) {

        if (arr.length == 0) {
            return -1;
        }
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
