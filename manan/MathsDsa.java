package manan;
import java.util.Arrays;
public class MathsDsa {
    public static void main(String args[]){
//        int n = 67;
//        System.out.println(isOdd(n));
//        int [] arr = { 2,3,3,4,2,6,4};
//        System.out.println(findUnique(arr));
//        int n = 5;
//        magicNumber(n);
//        int n = 10;
//        int b= 2;
//        noOfDigits(n,b);
//        int n = 30;
//        System.out.println(powerOf2(n));
//        int b = 3;
//        int p = 6;
//        power(b,p);
//        int n = 7;
//        System.out.println(Integer.toBinaryString(n));
//        System.out.println(setBits(n));
//        int a = 3;
//        int b = 9;
//        int ans = xor(b) ^ xor(a-1);
//        System.out.println(ans);
        int [] [] arr = {{1,1,0},{1,0,1},{0,0,1}};
        flippingImage(arr);
       System.out.println(Arrays.toString(arr));
    }
    static boolean isOdd(int n){
        return (n &1)==1;
    }
    static int findUnique(int [] arr){
        int unique = 0;
        for(int n: arr){
            unique = unique ^ n;
        }
        return unique;
    }
    static void magicNumber(int n){
        int ans = 0;
        int base = 5;
        while(n>0){
            int last = n & 1;
            n=n>>1;
            ans+=last*base;
            base = base*5;
        }
        System.out.println(ans);
    }
    static void noOfDigits(int n,int b){
        int ans = (int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
    static boolean powerOf2(int n){
        boolean ans = (n & (n-1))==0;
        return ans;
    }
    static void power(int b , int p){
        int ans =1;
        while(p>0){
            if((p & 1)==1){
                ans*=b;
            }
            b*=b;
            p=p>>1;
        }
        System.out.println(ans);
    }
    static int setBits(int n){
        int count =0;
        while(n>0){
            count ++;
            n = n & (n-1);
        }
        return count;
    }
    static int xor(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
    return 0;
    }
    static int [][] flippingImage(int [][] arr){
        for(int [] row: arr){
            for(int i=0;i<(arr[0].length+1)/2;i++){
                // swap
                int temp = row[i] ^1;
                row[i] = row[arr[0].length-i-1]^1;
                row[arr[0].length-i-1] = temp;
            }
        }
        return arr;
    }

}
