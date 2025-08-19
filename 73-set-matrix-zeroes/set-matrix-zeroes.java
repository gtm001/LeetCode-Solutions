class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int arr[][] = new int[row][col];

        // copy element in new arr.
        for(int i=0;i<row;i++){
            for(int j = 0;j<col;j++){
                arr[i][j] = matrix[i][j];
            }
        }

        for(int l=0;l<row;l++){
            for(int m = 0;m<col;m++){
                if(matrix[l][m]==0){
                    // set row to zero
                    for(int r=0;r<col;r++){
                        arr[l][r]=0;
                    }
                    // set col to zero
                    for(int c=0;c<row;c++){
                        arr[c][m]=0;
                    }
                }
            }
        }

        // copy back to the array
        for(int x=0;x<row;x++){
            for(int y=0;y<col;y++){
                matrix[x][y]=arr[x][y];
            }
        }
    }
}