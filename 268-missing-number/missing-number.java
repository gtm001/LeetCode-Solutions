class Solution {
    public int missingNumber(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length;i++){
            res^=nums[i];
        }
        int ans = 0;
        for(int i=0;i<=nums.length;i++){
            ans^=i;
        }
        return res^ans;
    }
}