class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j])
        //         return true;
        //     }
        // }
        // return false;


        // ------- Using HashSet ---------------
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            if(set.contains(val)){
                return true;
            }
            set.add(val);
        }
        return false;
    }
} 