class Solution {
    public int maximumDifference(int[] nums) {
        int left=0;
        int max = -1;
        for(int right=1;right<nums.length;right++){
            if(nums[right]>nums[left]){
                max = Math.max(max,nums[right]-nums[left]);
            }
            else{
                left=right;
            }
        }
        return max;
    }
}