package manan;

import java.util.*;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int [] nums1 = {1,2,2,1};
        Arrays.sort(nums1);
        int [] nums2 = {2};
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
               list.add(nums1[i]);
               i++;
               j++;
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
//    int n1  = nums1.length;
//    int n2  = nums2.length;
//    ArrayList<Integer> list1 = new ArrayList<>();
//    ArrayList<Integer> list2 = new ArrayList<>();
//        for(int i=0;i<n2;i++){
//        list1.add(nums2[i]);
//        }
//        for(int i:nums1){
//        if(list1.contains(i)){
//        list2.add(i);
//        }
//
//        }
//        int[] ans = new int[list2.size()];
//        for(int i = 0 ; i<list2.size();i++){
//        ans[i]=list2.get(i);
//        }
//        return ans;
