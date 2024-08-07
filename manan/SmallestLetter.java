package manan;

public class SmallestLetter {
    public static void main(String args[]){
        char arr[] = {'a','b','c'};
        char target = 'd';
        System.out.println(nextGreatestLetter(arr,target));
    }
    static char nextGreatestLetter(char[] arr,char target){
        int s = 0;
        int e  = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target<arr[mid]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return arr[s%arr.length];
    }
}
