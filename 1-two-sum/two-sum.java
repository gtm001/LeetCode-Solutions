class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> set = new HashMap<>();
        int res[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int val = target-nums[i];
            if(set.containsKey(val)){
                res[0] = set.get(val);
                res[1] = i;
            }
            set.put(nums[i],i); // key,value
        }
        return res;
    }
}