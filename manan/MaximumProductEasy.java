package manan;
import java.util.*;
public class MaximumProductEasy {
    public static void main(String[] args) {
        int [] nums = {-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(nums));
    }

    static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        Arrays.sort(nums);
        int max1 = nums[0]*nums[1]*nums[nums.length-1];
        int max2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        int mul = Integer.max(max1,max2);
        return mul;
    }
}
