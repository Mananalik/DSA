package manan;

public class MatrixJumpGame {
    public static void main(String[] args) {
        int nums[] = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    static boolean canJump(int [] nums){
        int n = nums.length;
        int sum=0;
        if(sum<n){
            for(int i=0;i<n;i++){
                sum = i+ nums[i];
                if(sum==n-1){
                    return true;
                }
                else if(nums[i]==0 && i!=n-1){
                    return false;
                }
            }
        }
        return false;
    }
}
