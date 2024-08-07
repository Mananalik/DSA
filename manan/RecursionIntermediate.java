package manan;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursionIntermediate {
    public static void main(String args[]){
//int [] arr = {1,2,3,5,4,6,7,8};
//System.out.println(arraySort(arr,0));
//        int [] arr = {32,87,65,44,32,97,34,32,56};
//        int target = 32;
//        System.out.println(search(arr,target,0));
//        System.out.println(findIndex(arr,target,0));
//        findAllIndex(arr,target,0);
//        System.out.println(list);
//        ArrayList<Integer> ans=  findAllIndex2(arr,target,0);
//    System.out.println(ans);
        int [] arr = {5,6,7,8,9,12,3};
        System.out.println(binarySearch(arr,8,0,arr.length-1));
    }
    static boolean arraySort(int []arr,int index){
     if(index == arr.length-1){
         return true;
     }
     return arr[index]<arr[index+1] && arraySort(arr,index+1);
    }
 static boolean search(int [] arr,int target , int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || search(arr,target,index+1);
 }
    static int findIndex(int [] arr,int target , int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndex(arr,target,index+1);
        }
    }
//   static ArrayList<Integer> list = new ArrayList<>();
//    static void findAllIndex(int [] arr,int target , int index){
//        if(index==arr.length){
//            return ;
//        }
//        if(arr[index]==target){
//            list.add(index);
//        }
//             findAllIndex(arr,target,index+1);
//
//    }
    static ArrayList<Integer> findAllIndex1(int [] arr,int target , int index,ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
       return findAllIndex1(arr,target,index+1,list);

    }
    // return the list but do not take it in the argument
    static ArrayList<Integer> findAllIndex2(int [] arr,int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow= findAllIndex2(arr,target,index+1);
        list.addAll(ansFromBelow);
        return list;
    }
    static int binarySearch(int [] arr,int target ,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(target>=arr[s] && target<=arr[m]){
                return binarySearch(arr,target,s,m-1);
            }else{
                return binarySearch(arr,target,m+1,e);
            }
        }
        if(target>=arr[m] && target<=arr[e]){
            return binarySearch(arr,target,m+1,e);
        }
        return binarySearch(arr,target,s,m-1);
    }
}
