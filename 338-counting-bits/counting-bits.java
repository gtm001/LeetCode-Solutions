class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=0;i<=n;i++){
                // int num = i;
                // int count = 0;
                // while(num!=0){
                //     if((num&1)!=0){
                //         count++;
                //     }
                //     num = num>>1;
                // }
                // ans[i] = count;

                // using DP
                ans[i] = ans[i>>1] + (i&1);
            
        }
        return ans;
    }
}