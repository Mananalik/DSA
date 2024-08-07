package manan;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x=0;
        while(a>0){
            x = x*10 + (a%10);
            a = a/10;
        }
        System.out.println(x);
    }
}
