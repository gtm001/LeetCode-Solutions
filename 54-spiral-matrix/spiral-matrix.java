class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int srow = 0;
        int scol = 0;
        int erow = m-1;
        int ecol = n-1;

        while(srow<=erow && scol<=ecol){
            // Adding Upper
            for(int i=scol;i<=ecol;i++){
                list.add(matrix[srow][i]);
            }

            // Adding Right
            for(int i=srow+1;i<=erow;i++){
                list.add(matrix[i][ecol]);
            }

            // Adding Bottom
        if(srow<erow){
            for(int i=ecol-1;i>=scol;i--){
                // if(matrix[srow][i]==matrix[erow][i]){
                //     break;
                // }
                list.add(matrix[erow][i]);
            }
            }

            // Adding left
            if(scol<ecol){
            for(int i=erow-1;i>srow;i--){
                list.add(matrix[i][scol]);
            }
            }

            srow++;
            erow--;
            ecol--;
            scol++;
        }
        return list;
    }
}