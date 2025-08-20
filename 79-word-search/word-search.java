class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(DFS(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
        
    }
    public static boolean DFS(char[][] board,String word,int i,int j,int idx){
        if(idx==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length|| j>=board[0].length ||board[i][j]!=word.charAt(idx)){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = DFS(board,word,i+1,j,idx+1)||
                        DFS(board,word,i-1,j,idx+1)||
                        DFS(board,word,i,j-1,idx+1)||
                        DFS(board,word,i,j+1,idx+1);

        board[i][j] = temp;
        return found;
    }
}