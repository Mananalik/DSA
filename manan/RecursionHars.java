package manan;

import java.util.ArrayList;
import java.util.List;

public class RecursionHars {
    public static void main(String args[]){
//     ArrayList<String> ans = padret("","12");
//     System.out.println(ans);
     ArrayList<String> ans= diceRet("",4);
     System.out.println(ans);
    }
    static void letterCombinations(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';// convert '2' into 2
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch = (char) ('a'+i);
            letterCombinations(p+ch,up.substring(1));
        }
    }
    static ArrayList<String> padret(String p,String up){
        if(up.equals("")){
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        if(up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0)-'0';
        for(int i=(digit-2)*3;i<(digit-1)*3;i++){
            char ch = (char) ('a'+i);
            ans.addAll(padret(p+ch,up.substring(1)));
        }
        return ans;
    }
    static int padCount(String p,String up){
        if (up.isEmpty()){
            return 1;
        }
        int digit = up.charAt(0)-'0';// convert '2' into 2
        int count=0;
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch = (char) ('a'+i);
        count = count + padCount(p+ch,up.substring(1));
        }
        return count;
    }
     static List<String> solve(String ans, String ip) {

        if(ip.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        int digit = ip.charAt(0) - '0';
        int i=(digit-2)*3;
        if(digit > 7) {
            i+=1;
        }
        int len = i+3;
        if(digit == 7 || digit == 9) {
            len+=1;
        }

        ArrayList<String> list = new ArrayList<>();

        for(; i<len; i++) {
            char ch = (char)('a' + i);
            list.addAll(solve(ans+ch, ip.substring(1)));
        }

        return list;

    }
    static void dice(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            dice(p+i,target-i);
        }
    }
    static ArrayList<String> diceRet(String p,int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans =new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            ans.addAll(diceRet(p+i,target-i));
        }
        return ans;
    }
    static void faceDice(String p, int target , int face){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=face && i<=target;i++){
            faceDice(p+i,target-i,face);
        }
    }
}
