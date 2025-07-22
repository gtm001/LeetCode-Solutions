class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int l = 0;
        for(int r=0;r<nums.length;r++){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                sum=sum-nums[l];
                l++;
            }
            sum+=nums[r];
            max = Math.max(max,sum);
            set.add(nums[r]);
        }
        return max;
    }
}