package manan;

public class FindInMountainArray {
    public static void main(String args[]){
        int [] arr = {0,1,2,4,2,1};
        int target = 3;
        int peak = findPeakInMountainArray(arr);
        int firstTry = search(arr,target,0,peak);
        if(firstTry!=-1){
            System.out.println(firstTry);
        }
        int secondTry = search(arr,target,peak+1,arr.length-1);
        System.out.println(secondTry);
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
    static int search(int [] arr ,int target , int s , int e){
        boolean isAsc = arr[s]<arr[e];
        while (s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]== target){
                return mid;
            }
            if(isAsc) {
                if (target > arr[mid]) {
                    s = mid + 1;
                } else  {
                    e = mid - 1;
                }
            }
            else{
                if(target>arr[mid]){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
        }
        return -1;
    }
}
