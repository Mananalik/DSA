package manan;
import java.util.Scanner;
public class Fibo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
         0 ,1 , 1, 2, 3, 4
         */
        int i=2;
        int b=0;
        int a=1;
        int temp;
        while(i<=n){
            temp = a;
            a = a + b;
            b = temp;
                    i++;
        }
        System.out.println(a);
    }

}