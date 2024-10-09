package manan1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Biginteger {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;
        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(3363);
        int c = B.intValue();// convert BI to int
        BigInteger C =new BigInteger("55752721423534535646758");
        BigInteger X =new BigInteger("55752721423534535646758");
        // constants
        BigInteger D = BigInteger.TEN;
        // addition
        BigInteger s= C.add(X);
        BigInteger m = C.multiply(X);
        BigInteger sub = C.subtract(X);
//        System.out.println(fact(2345));
        BD();
    }
    static BigInteger fact(int num){
        BigInteger ans = new BigInteger("1");
        for(int i = 2;i<=num;i++){
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
    static void BD(){
        double x = 0.03;
        double y = 0.04;
        double ans = y-x;
        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ans1 = Y.subtract(X);

        System.out.println(ans1);
    }
}
