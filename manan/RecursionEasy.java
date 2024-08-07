package manan;

public class RecursionEasy {
    public static void main(String args[]) {
//fun(5);
//        funRev(5);
//        System.out.println(fact(6));
//        System.out.println(productOfDigits(12345));
//        rev(1308);
//        System.out.println(sum);
//        System.out.println(rev2(1234));
//        System.out.println(palin(123321));
//        System.out.println(count2(40005));
        System.out.println(steps(8));
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }

    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n - 1);
        System.out.println(n);
    }

    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    static int productOfDigits(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * productOfDigits(n / 10);


        // 1242
        // 1242%10=2 1242/10=124
        // There is a difference between n-- and --n
    }
static int sum =0;
    static void rev(int n){
        if(n==0){
            return ;
        }
        sum = sum*10 + n%10 ;
         rev(n/10);
    }
    static int rev2(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }
   private static int  helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
       return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
   }
   static boolean palin(int n){
        return n == rev2(n);
   }
   // count number of zeroes
    static int count =0;
    static int countZeroes(int n){
        if(n%10==n){
            return n;
        }
        int x = n%10;
        if(x==0){
            count++;
        }
        countZeroes(n/10);
        return count;
    }
    static int  count2(int n){
        return helper1(n,0);
    }
    private static int helper1(int n,int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helper1(n/10,c+1);
        }
        return helper1(n/10,c);
    }
    static int steps(int num){
        return helper2(num,0);
    }
    static int helper2(int num,int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper2(num/2,steps+1);
        }
        return helper2(num-1,steps+1);
    }
}