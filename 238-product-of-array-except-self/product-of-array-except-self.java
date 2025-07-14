class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n  = nums.length;
        int[] res = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int mulP = 1;
        for(int i=0;i<n;i++){
            mulP = nums[i] * mulP;
            prefix[i] = mulP;
        }
        int mulS = 1;
        for(int i=n-1;i>=0;i--){
            mulS = nums[i] * mulS;
            suffix[i] = mulS;
        }
        for(int i=0;i<n;i++){
            if(i==0){
                res[i] = suffix[i+1];
            }
            else if(i==n-1){
                res[i] = prefix[i-1];
            }
            else{
            res[i] = prefix[i-1]*suffix[i+1];
            }
        }
        return res;
    }
}