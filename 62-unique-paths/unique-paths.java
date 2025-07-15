class Solution {
    public int uniquePaths(int m, int n) {
        // if(m==0||n==0){
        //     return 0;
        // }
        // if(m==1 && n==1){
        //     return 1;
        // }
        int[][]dp = new int[m+1][n+1];
        // pre-populate
        for(int i=0;i<=n;i++){
            dp[0][i] = 0;
        }
        for(int j=0;j<=m;j++){
            dp[j][0] = 0;
        }
        dp[1][1] = 1;
        // fill dp table;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1 && j==1){
                    continue;
                }
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m][n];
    }
}

// Time complexity m*n