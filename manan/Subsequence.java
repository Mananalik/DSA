package manan;
import java.util.ArrayList;
public class Subsequence {
    public static void main(String args[]){
        System.out.println(subSeqAscii1("","abc"));
//        subseqAscii("","abc");
    }
    static void subSeq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p,up.substring(1));
        subSeq(p+ch,up.substring(1));
    }
    static ArrayList<String> subSeq1(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list  = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left= subSeq1(p+ch,up.substring(1));
        ArrayList<String> right =subSeq1(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subseqAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p+ch,up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p+(ch+0),up.substring(1));
    }
    static ArrayList<String> subSeqAscii1(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list  = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first= subSeqAscii1(p+ch,up.substring(1));
        ArrayList<String> second =subSeqAscii1(p,up.substring(1));
        ArrayList<String> third= subSeqAscii1(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
