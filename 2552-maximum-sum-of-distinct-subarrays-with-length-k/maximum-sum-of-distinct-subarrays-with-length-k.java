class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long maxSum = 0;
        int left = 0;
        if(nums.length<k){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right])){
                sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[right]);
            sum+=nums[right];
            if(right-left+1==k){
                maxSum=Math.max(maxSum,sum);
                sum = sum-nums[left];
                set.remove(nums[left]);
                left++;
            }
        }
        return maxSum;
    }
}