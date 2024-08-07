package manan;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursionSelfPractice {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5 };
        //Recursive function that will print answer
        printTriangle(x);
        System.out.println(Arrays.toString(x));
    }
    static void printTriangle(int [] arr){
        if(arr.length==1){
            return;
        }
        int [] temp = new int [arr.length-1];
        helper(temp,arr,0);
        printTriangle(temp);
        System.out.println(Arrays.toString(temp));
    }
    static int[] helper(int [] temp,int[] arr,int index ){
        if(index==arr.length-1){
            return temp;
        }
        temp[index]=arr[index]+arr[index+1];
        return helper(temp,arr,index+1);
    }
}
