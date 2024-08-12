package manan;

import java.util.Arrays;
import java.util.Collections;

public class MaximumNumberEasy {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));

    }
    static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int flag=0;

        for(int i=nums.length-1;i>0;i--){
            if( nums[i]==nums[i-1]){
                flag=flag+1;
            }
            else{
                count++;
            }
            if(count==3){
                return nums[nums.length-count-flag];
            }
        }

        return nums[nums.length-1];
    }
}
