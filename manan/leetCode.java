package manan;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.lang.*;
import java.lang.String;
public class leetCode {
    public static void main(String args[]) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        combinationalSum(result , new ArrayList<Integer>(),candidates,target,0);
//        System.out.println(isPower(3,0));
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        for(int i=0;i<x;i++){
//            int A = sc.nextInt();
//            int B = sc.nextInt();
//            int N = sc.nextInt();
//            System.out.println(fibonacci(A,B,N));
//        }
//    System.out.println(stringLength("GEEKSFORGEEKS"));
    }


    //   static void selection(int [] arr,int r,int c, int max){
//        if(r==0){
//            return;
//        }
//        if(c<r){
//            if(arr[c]>arr[max]){
//                selection(arr,r,c+1,c);
//            }
//            else{
//                selection(arr,r,c+1,max);
//            }
//        }
//        else{
//            int temp = arr[max];
//            arr[max] = arr[r];
//            arr[r] = temp;
//            selection(arr,r,0,0);
//        }
//   }
//    static void upper( String unprocessed){
//        if(unprocessed.equals("")){
//            System.out.println("no upper case letter");
//            return;
//        }
//        String processed = "";
//        char ch = unprocessed.charAt(0);
//        if(Character.isUpperCase(ch)) {
//            System.out.println(processed + ch);
//            return;
//        }
//        else{
//            upper(unprocessed.substring(1));
//        }
//        return;
//    }
//    static void reverseString(char [] arr, int index){
//        if(index==arr.length/2){
//            System.out.println(Arrays.toString(arr));
//            return;
//        }
//        else{
//            char temp = arr[index];
//            arr[index]=arr[arr.length-1-index];
//            arr[arr.length-1-index]=temp;
//            reverseString(arr,index+1);
//        }
//        return;
//    }
//static int fibonacci(int A , int B, int N){
//    if(N==0){
//        return A;
//    }
//    if(N==1){
//        return B;
//    }
//    return fibonacci(A,B,N-1)^fibonacci(A,B,N-2);
//}
//    static int count=0;
//    static int stringLength(String x){
//        if(x.isEmpty()){
//            return count;
//        }
//        count++;
//        return stringLength(x.substring(1));
//    }
//    static boolean isPower(int n , int digit){
//        if(Math.pow(2,digit)>n) {
//            return false;
//        }
//        if(Math.pow(2,digit)==n){
//            return true;
//        }
//
//      return  isPower(n,digit+1);
//    }
//    static void combinationalSum(List<List<Integer>> result, List<Integer> arr, int[] candidates, int target, int start) {
//        if (target > 0) {
//            for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
//                arr.add(candidates[i]);
//                combinationalSum(result, arr, candidates, target - candidates[i], i);
//                arr.remove(arr.size()-1);
//            }
//        } else if (target == 0) {
//             result.add(new ArrayList<Integer> (arr));
//        }
//    }
    static boolean exist(char [][] board ,String up, String word , int r , int c,int i){
     if(r==1 && c==1) {
         if(up.equals(word)) {
             return true;
         }
     }
     if(r>1) {
         if(board[r][c]==word.charAt(i)) {
             exist(board,up+word.charAt(i),word,r-1,c,i+1);
         }
         else {

         }
     }
     return false;
    }
}

//    static int[] mergeSort(int[] nums1, int m, int[] nums2, int n) {
//        int[] mix = new int[m + n];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while (i < m && j < n) {
//            if (nums1[i] < nums2[j]) {
//                if (nums1[i] != 0) {
//                    mix[k] = nums1[i];
//                    i++;
//                } else {
//                    i++;
//                }
//            } else {
//                if (nums2[j] != 0) {
//                    mix[k] = nums2[j];
//                    j++;
//                } else {
//                    j++;
//                }
//            }
//            k++;
//        }
//        while (i < m) {
//            if (nums1[i] != 0) {
//                mix[k] = nums1[i];
//                i++;
//                k++;
//            } else {
//                i++;
//            }
//        }
//        while (j < n) {
//            if (nums2[j] != 0) {
//                mix[k] = nums2[j];
//                j++;
//                k++;
//            } else {
//                j++;
//            }
//        }
//        return mix;
//    }




