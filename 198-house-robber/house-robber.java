class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n<2){ //-------
            return nums[0];
        }
        int tillMax[] = new int[n];
        tillMax[0] = nums[0];
        tillMax[1] = Math.max(nums[0],nums[1]); //--------
        for(int i=2;i<n;i++){
            tillMax[i] = Math.max(tillMax[i-2]+nums[i],tillMax[i-1]);
        }
        return tillMax[n-1];
    }
}

// If state is tied to array elements, use n.
// If state is tied to "positions" (before/after array), use n+1.