package manan;
import java.util.*;
public class LargestPerimeterTriangle {
    public static void main(String[] args) {
          int [] arr = {2,4,4,5,3};
          System.out.println(largestPerimeter(arr));
    }
    static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>1;i--){
            if(nums[i]<nums[i-1]+nums[i-2]){
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }
}
