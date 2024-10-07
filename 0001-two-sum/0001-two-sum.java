import java.util.Scanner;
class Solution {
 public int[] twoSum(int[] nums, int target){
//    public static  void main(string[] args) {
        // Scanner sc = new Scanner(System.in);
       int arr[] = new int[2];
        int i;
        // for( i=0;i<5;i++){
        //     arr[i] = sc.nextInt();
        // }
        // int a = sc.nextInt();
        for(i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
               if( nums[i] + nums[j] == target){
                 arr[0]=i;
                 arr[1]=j;
                 return arr;
               }
            }
            
        }
     return new int[0];
    }
}