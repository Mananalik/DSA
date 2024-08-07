package manan;

public class CeilingNumber {
    public static void main(String args[]){
        int arr[] = { 1,5,7,9,11,14,65,78,86};
        int target = 10;
        System.out.println(ceilingNum(arr,target));

    }
    static int ceilingNum(int[]arr,int target){
        int s= 0;
        int e = arr.length - 1;
        while(s<=e){
            int mid = s + (e-s)/2;
            // smallest element in array greater than or equal to target0

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
        return e;
    }
}
