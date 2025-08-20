class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int arr[][] = new int[row][col];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                arr[i][j] = matrix[row-1-j][i];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=arr[i][j];
            }
        }
    }
}