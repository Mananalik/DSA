package manan;

public class RotationCount {
    public static void main (String args[]){
        int [] arr = {1,2,3,4,5,60};
        System.out.println(countRotations(arr));
    }

static int countRotations(int [] arr){
    int pivot = findPivot(arr);
    return pivot+1;
}
    static int findPivotWithDuplicates(int [] arr){
        int s = 0;
        int e = arr.length - 1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[s] && arr[mid]==arr[e]){
                if(arr[s] > arr[s+1]){
                    return s;
                }
                s++;
                if(arr[e]<arr[e-1]){
                    return e-1;

                }
                e--;
            }
            else if(arr[s]<arr[mid] || arr[s]==arr[mid] && arr[mid]>arr[e]){
                s=  mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;
    }
    static int findPivot(int [] arr){
        int s=0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid >s&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<=arr[s]){
                e = mid-1;
            }
            else{
                s = mid+ 1;
            }
        }
        return -1;
    }
}