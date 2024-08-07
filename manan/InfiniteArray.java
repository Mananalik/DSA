package manan;

public class InfiniteArray {
    public static void main(String args[]){
    int arr[] = {1,3,5,6 };
    int target = 5;
    System.out.println(ans(arr,target));
    }
    static int ans (int [] arr,int target){
        int s= 0;
        int e= 1;
        while (target > arr[e]){
            int newStart =e+1;
            e = e+ (e-s+1)*2;
            s = newStart;
        }
        return search(arr,target,s,e);
    }
    static int search(int [] arr , int target,int s, int e){
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target<arr[mid]){
                e = mid-1;
            }
            else if(target>arr[mid]){
                s = mid+1;
            }
            else{
               return mid;
            }
        }
        return -1;
    }
}
