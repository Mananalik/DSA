package manan;

import java.util.Arrays;

public class AssignCookiesEasy {
    public static void main(String[] args) {
        int [] g = {1,2};
        int [] s= {1,2,3};
        System.out.println(findContentChildren(g,s));
    }
    static int findContentChildren(int[] g, int[] s) {
//        Arrays.sort(g);
//        Arrays.sort(s);
//        int m = g.length;
//        int n = s.length;
//        int count =0;
//        int i=0;
//        int j =0;
//        while(i<m && j<n){
//            if(s[j]>=g[i]){
//                count++;
//                i++;
//                j++;
//            }
//            else{
//                i++;
//                j++;
//            }
//        }
//        return count;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        for(int j=0;i<g.length && j<s.length;j++){
            if(g[i]<=s[j]){
                i++;
            }

        }
        return i;
    }
}
