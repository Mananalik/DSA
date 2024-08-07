package manan;

public class min {
    public static void main(String args[]){
        int arr[] = {12,33,45,63,24,6,43,10};
        System.out.println(minno(arr));
    }
    static int minno(int [] arr){
        if(arr.length==0){
            return -1;
        }
        int min = 9999;
        for(int i: arr){
            if(i<min){
                min = i;
            }
        }
        return min;
    }
}
