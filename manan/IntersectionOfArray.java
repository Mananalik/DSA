package manan;

import java.util.*;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        Arrays.sort(nums1);
        int [] nums2 = {9,4,9,8,4};
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(inter(nums1,nums2)));
    }
    static int [] inter (int [] nums1 , int [] nums2){
       ArrayList<Integer> list = new ArrayList<>();
       int i=0;
       int j=0;
       int k=0;
       while(i<nums1.length & j<nums2.length){
           if(nums1[i]<nums2[j]){
               i++;
           }
           else if(nums2[j]<nums1[i]){
               j++;
           }
           else{
               if(list.contains(nums1[i])){
                   i++;
                   j++;
               }
               else {
                   list.add(nums1[i]);
                   i++;
                   j++;
               }
           }
       }
       int n = list.size();
       int [] arr = new int [n];
       for (int x=0;x<n;x++){
           arr[x]=list.get(x);
       }
       return arr;
    }
}
