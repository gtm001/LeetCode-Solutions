class Solution {
    public int longestConsecutive(int[] nums) {

    // ----------- Using Array Sort, Time Complexity - O(nlogn) -----------------------
    //     int n = nums.length;
    //     int maxL = 0;
    //     int l = 1;
    //     if(nums.length == 0){
    //         return 0;
    //     }
    //     Arrays.sort(nums);
    //     for(int i=0;i<n;i++){
    //         if(i>0 && nums[i]==nums[i-1]){
    //             continue;
    //         }
    //         else if(i>0 && nums[i]==nums[i-1]+1){
    //             l++;
    //         }
    //         else{
    //             l = 1;
    //         }
    //         maxL = Math.max(maxL,l);
    //     }
    //     return maxL;
    // }

    // ----------- using HashSet , Time-Complexity O(n) -----------------------------------
     HashSet<Integer> set = new HashSet<>();
     for(int num:nums){
        set.add(num);
     }
     int len = 0;
     int maxLen = 0;
     for(int val:set){
        if(!set.contains(val-1)){
            int currVal = val;
            len = 1;
            while(set.contains(currVal+1)){
                currVal++;
                len++;
                }
                maxLen = Math.max(maxLen,len);
            }
        }
        return maxLen;
    }
}