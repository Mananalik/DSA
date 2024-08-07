package manan;
import java.util.Scanner;
public class Occurrence{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        long n = sc.nextLong();
        System.out.println("Enter the number to be checked");
        int a = sc.nextInt();
        int count =0;
        long i;
        while(n>0){
            i = n%10;
            if(i==a){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}