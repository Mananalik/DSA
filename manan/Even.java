package manan;

public class Even {
    public static void main (String args[]) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] arr){
        int count =0;
        for(int i : arr){
           if(even(i)){
               count++;
           }
        }
        return count;
    }
    static boolean even(int num){
        int noofdigits = digits(num);
        return noofdigits%2==0;
    }
     static int digits(int num){
        if (num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count =0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
     }

}
