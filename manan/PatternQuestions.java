package manan;

public class PatternQuestions {
    public static void main(String args[]){
//        reversePattern(5);
//        numberPattern(5);
//        middlePattern(9);
//        pattern28(5);
//        pattern30(5);
//        pattern17(5);
        pattern31(4);
    }
    static void reversePattern(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void numberPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void middlePattern(int n){
        for(int i=1;i<=n;i++){
            if(i<=(n/2)+1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                for(int j=0;j<=n-i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    static void pattern28 (int n){
        for(int row=0;row<2*n;row++){
            int totalColsInRow = row > n ? 2*n - row: row;
            int noOfSpaces = n - totalColsInRow;
            for(int s=0;s<noOfSpaces;s++){
                System.out.print(" ");
            }
            for(int col=0;col<totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for(int row=1;row<=n;row++){
            int noOfSpaces = n - row;
            for(int s=0;s<noOfSpaces;s++){
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
static void pattern17(int n){
    for(int row=1;row<=2*n;row++){
        int c=row>n ? 2*n - row: row;
        int noOfSpaces = n - c;
        for(int s=0;s<noOfSpaces;s++){
            System.out.print("  ");
        }
        for(int col=c;col>=1;col--){
            System.out.print(col+" ");
        }
        for(int col=2;col<=c;col++){
            System.out.print(col+" ");
        }
        System.out.println();
    }
}
static void pattern31(int n){
        int original = n;
        n = 2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int index = original - Math.min(Math.min(i,j),Math.min(n-i,n-j));
                    System.out.print(index+" ");

            }
            System.out.println();
        }
}

}
