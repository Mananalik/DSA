package manan;

import java.util.Arrays;

public class ProductNew {
    public static void main(String[] args) {
        int [] nums = {-1,-1,0,-3,-3};
        productExceptItself(nums);
        System.out.println(Arrays.toString(nums));
    }
    // Brute force solution doesn't work on time complexity O(n)
//    static int [] productExceptItself(int [] nums){
//        int n = nums.length;
//        int [] ans  = new int [n];
//        for(int i=0;i<n;i++){
//            int products = 1;
//            for(int j=0;j<n;j++){
//                if(i!=j){
//                    products = products*nums[j];
//                }
//                ans[i] = products;
//            }
//        }
//        return ans;
//    }
    static int [] productExceptItself(int [] nums){
        int n  = nums.length;
        int [] ans  = new int [n];
        int [] pre = new int [n];
        int [] suf = new int [n];
        pre[0]=1;
        suf[n-1]=1;
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suf[i]=suf[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            ans[i]=pre[i]*suf[i];
        }
        return ans;
    }
}
