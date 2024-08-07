package manan;

public class stringSearch {
    public static void main(String args[]){
        String name = "Manan";
        char srch = 'n';
        System.out.println(stringSearch(name,srch));
    }
    static boolean stringSearch(String str , char x){
        if(str.length()==0){
            return false;
        }
//        for(int i=0;i<str.length();i++){
//            if(x==str.charAt(i)){
//                return true;
//            }
//        }
        for(char ch: str.toCharArray()){
            if(ch==x){
                return true;
            }
        }
        return false;
    }

}
