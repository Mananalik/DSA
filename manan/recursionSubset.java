package manan;
import java.util.ArrayList;
public class recursionSubset {
    public static void main(String args[]){
     System.out.println(AppnotApple("baccappldh"));
    }
   static void skip(String processed , String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if(ch=='a'){
            skip(processed,unprocessed.substring(1));
        }
        else{
            skip(processed+ch,unprocessed.substring(1));
        }
   }
   static String skip1( String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip1(up.substring(1));
        }
        return ch+skip1(up.substring(1));
   }
   static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return (up.substring(5));
        }
        return up.charAt(0)+skipApple(up.substring(1));
   }
   static String AppnotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return AppnotApple(up.substring(3));
        }
        return up.charAt(0)+AppnotApple(up.substring(1));
   }
}
