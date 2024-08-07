package manan;
import java.util.ArrayList;
public class MathsDsa2 {
    public static void main(String args[]) {
//        int n = 5;
//        for(int i=0;i<=n;i++){
//            System.out.println(i+" "+isPrime(i));
    //}
//        int n = 40;
//        boolean [] primes = new boolean [n+1];
//        System.out.println(primes[0]);
//        sieve(n,primes);
//        int n = 36;
//        int p=3;
//        System.out.println(sqrt(n,p));
//        System.out.println(sqrt(40));
//        int n = 20;
//        factors2(n);
//        System.out.println(gcd(4,8));
        System.out.println(lcm(9,18));

    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
        }
        return true;
    }
    // sieve of Eratosthenes
    // false in array means number is prime
    static void sieve(int n , boolean[] primes){
        for(int i=2;i*i<=n;i++){
            if(primes[i]==false){
                   for(int j=i*2;j<=n;j+=i){
                       primes[j] = true;
                   }
            }
        }
        for(int i=2;i<=n;i++){
            if(primes[i]==false){
              System.out.print(i+" ");
                }
            }
        }
        static double sqrt(int n,int p){
        int s=0;
        int e = n;
        double root = 0.0;
        while(s<=e){
            int m = s+(e-s)/2;
            if(m*m == n){
                return m;
            }
            if(m*m>n){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        double incr = 0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;
        }
        // Newton Raphson Method
    static double sqrt (double n){
        double x = n;
        double root;
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<1){
                break;
            }
            x=root;
        }
        return root;
    }
    static void factors2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }
            for(int j= list.size()-1;j>=0;j--){
                System.out.print(list.get(j)+" ");
            }

    }
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(a%b,a);
    }
    static int lcm(int a , int b){
        return a*b/gcd(a,b);
    }
    }
