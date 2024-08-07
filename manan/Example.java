package manan;

public class Example {
    public static void main(String[] args) {

           int [][] matrix = new int [100][];
                int rowStart =0;
                int rowEnd = matrix.length-1;
                int colStart = 0;
                int colEnd = matrix[0].length-1;
                for(int i=0;i<=rowEnd;i++){
                    for(int j=0;j<=colEnd;j++){
                        if(matrix[i][j]==0){
                            for(int x=0;x<=rowEnd;x++){
                                matrix[x][j]=0;
                            }
                            for(int y=0;y<=colEnd;y++){
                                matrix[i][y]=0;
                            }
                        }
                    }
                }
                for(int i=0;i<=rowEnd;i++){
                    for(int j=0;j<=colEnd;j++){

                    }
                }
            }
        }


