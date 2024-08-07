package manan;

public class MissingNumber {
    public static void main(String args[]){
        int [] arr = {3,0,1};
        cycleSort(arr);
        System.out.println(cycleSort(arr));
    }
    static int cycleSort(int [] arr){
        int n = arr.length;
        int i=0;
        while(i<n){
            int x = arr[i];
            if(arr[i]<n && arr[i]!=arr[x]){
                swap(arr,i,x);
            }else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
        }
    static void swap(int [] arr,int first , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
    }


