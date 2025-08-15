class Solution {
    public int findPeakElement(int[] nums) {
        int i = 1;
        int n = nums.length;
        int idx = -1;
        if(n==1){ // special case
            return 0;
        }
        if(nums[0]>nums[1]){ // for the first element check, coz it has only one neighbour that is the rightSide one!
            return 0;
        }
        while(i<n-1){
            if(nums[i-1]<nums[i] && nums[i]>nums[i+1]){
                idx = i;
                break;
            }
            i++;
        }
        if(idx==-1 && nums[n-1]>nums[n-2]){
            return n-1;
        }
    return idx;
    }
}