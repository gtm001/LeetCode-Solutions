class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int maxL = 0;
        int l = 1;
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            else if(i>0 && nums[i]==nums[i-1]+1){
                l++;
            }
            else{
                l = 1;
            }
            maxL = Math.max(maxL,l);
        }
        return maxL;
    }
}