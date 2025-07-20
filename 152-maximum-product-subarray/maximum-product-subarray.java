class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int res = Integer.MIN_VALUE;
        int mulFleft = 1;
        int mulFright = 1;
        for(int i=0;i<n;i++){
            mulFleft*=nums[i];
            mulFright*=nums[n-1-i];
            res = Math.max(res,Math.max(mulFleft,mulFright));
            if(mulFleft==0){
                mulFleft = 1;
            }
            if(mulFright==0){
                mulFright = 1;
            }
        }
        return res;
    }
}