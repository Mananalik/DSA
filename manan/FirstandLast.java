package manan;

public class FirstandLast {
    public static void main(String args[]){
        int arr[] = {5,7,7,8,8,10};
        int target = 8;
        int [] arr1 = searchRange(arr,target);
        for(int i=0;i<2;i++){
            System.out.println(arr1[i]);
        }

    }
    static int [] searchRange(int []arr,int target){
       int [] ans = {-1,-1};
       int start = search(arr,target,true);
       int end =  search (arr,target,false);
       ans[0] = start;
       ans[1] = end;
     return ans;
    }
    static int search(int [] arr , int target,boolean findStart){
        int ans = -1;
        int s= 0;
        int e = arr.length-1;
        while(s<=e){
                int mid = s+(e-s)/2;
                if(target<arr[mid]){
                    e = mid-1;
                }
                else if(target>arr[mid]){
                    s = mid+1;
                }
                else{
                    ans = mid;
                    if(findStart){
                        e = mid -1 ;
                }
                    else{
                        s = mid+1;
                    }
            }
        }
        return ans;
    }

}
