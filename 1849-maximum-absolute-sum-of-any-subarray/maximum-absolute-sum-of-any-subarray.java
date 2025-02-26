class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0;
        int minSum = 0;
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            maxSum+=nums[i];
            minSum+=nums[i];
            maxVal = Math.max(maxVal,maxSum);
            minVal = Math.min(minVal,minSum);
            if(maxSum<0){
                maxSum = 0;
            }
            if(minSum>0){
                minSum = 0;
            }
        }
        return Math.max(maxVal,Math.abs(minVal));
    }
}