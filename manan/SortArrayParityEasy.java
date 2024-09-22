package manan;
import java.util.*;
public class SortArrayParityEasy {
    public static void main(String[] args) {
        int [] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=nums.length-1;
        int ans[] = new int[n];
        if(n==1){
            return nums;
        }
        for(int k:nums){
            if(k%2==0){
                ans[i]=k;
                i++;
            }
            else{
                ans[j]=k;
                j--;
            }
        }
        i=0;
        j=n-1;
        for(int k=0;k<n;k++){
            if(k%2==0){
                nums[k]=ans[i];
                i++;
            }
            else{
                nums[k]=ans[j];
                j--;
            }
        }
        return nums;
    }
}
