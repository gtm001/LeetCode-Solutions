class Solution {
    public long coloredCells(int n) {
        long res = 1;
        if(n==1){
            return 1;
        }
        for(int i=0;i<n;i++){
            long fmul = 4*i;
            res = res+fmul;
        }
        return res;
    }
}