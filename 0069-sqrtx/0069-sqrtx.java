class Solution {
    public int mySqrt(int x) {
       long start =0;
        long end = x;
       long result=0;
        while(start<=end){
            long mid = start + (end-start)/2;
            if(x==1 || x==0){
                return x;
            }
            if(mid*mid==x ){
                return (int)mid;
            }
            if(mid*mid<x){
                 start=mid+1;
                  result =mid;
            }else if(mid*mid>x){
                end =mid-1;
            }
 
        }
        return (int)result;
    }
}