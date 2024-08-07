package manan;

import java.util.ArrayList;

public class MissingPositive {
    public static void main (String args[]){
        int [] arr = {3,4,-1,1};
        firstMissingPositive(arr);
    }
    static void firstMissingPositive(int []arr){
        int n = arr.length;
        int i=0;
        while(i<n) {
            int x = arr[i] - 1;

           if (arr[i]>0 && arr[i] <= n && arr[i] != arr[x] ) {
                swap(arr, i, x);
            }
            else {
                i++;
            }
        }
            ArrayList<Integer> ans = new ArrayList<>();
            for(int j=0;j<arr.length;j++){
                if(arr[j]!=j+1 && j<arr.length){

                    ans.add(j+1);
                }


            }
            System.out.println(ans);



    }
    static void swap(int [] arr,int first , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
