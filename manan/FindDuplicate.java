package manan;
import java.util.ArrayList;
import java.util.List;
public class FindDuplicate {
    public static void main(String args[]){
        int [] arr = {4,3,2,7,8,2,3,1};
        //{1,2,3,4,2}
        cycleSort(arr);
    }
    static void cycleSort(int []arr){
        int i=0;
        while(i<arr.length){
            int x = arr[i]-1;
            if(arr[i]!=arr[x]){
                swap(arr,i,x);
            }
            else{
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            int x = j+1;
            if(arr[j]!=x && x<arr.length){
                ans.add(arr[j]);
            }


        }
        System.out.println(ans);

    }
    static void swap(int [] arr,int first , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
