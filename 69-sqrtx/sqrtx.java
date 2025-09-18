class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int ans = 0;
        int l=0;
        int h = x;
        while(l<=h){
            int mid = l+(h-l)/2;
            long sq = (long)mid*mid;
            if(sq==x){
                return mid;
            }
            else if(sq<x){
                ans =mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }
}