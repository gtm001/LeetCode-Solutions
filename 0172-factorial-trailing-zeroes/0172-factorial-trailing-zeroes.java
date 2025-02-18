class Solution {
    public int trailingZeroes(int n) {
        int sum = 0;
        int f = 5;
        while(n/f>0){
            sum+=n/f;
            f=f*5;
            // n=n/10;
        }
        return sum;
    }
}