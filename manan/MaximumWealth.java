package manan;

public class MaximumWealth {
    public static void main(String [] args){
        int arr[][] = {{1,5},
                {3,7},
                {3,5}};
        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
