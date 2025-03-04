class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(x==1){
            return x;
        }
        if(n<0){
            x = 1.0/x;
            if(n==Integer.MIN_VALUE){
                return x*myPow(x,Integer.MAX_VALUE);
            }
            n*=-1;
        }
        return (n%2==0)?myPow(x*x,n/2):x*myPow(x,n-1);
    }
}