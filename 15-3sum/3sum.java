class Solution {

    // ---------- using Hashing ------------------
    // public List<List<Integer>> threeSum(int[] nums) {
    //     // Better Approach
    //     Set<List<Integer>> set = new HashSet<>();
    //     for(int i=0;i<nums.length;i++){
    //         Set<Integer> seen =new HashSet<>();
    //         for(int j=i+1;j<nums.length;j++){
    //             int sum = -(nums[i]+nums[j]);
    //             if(seen.contains(sum)){
    //                 List<Integer> triplet = Arrays.asList(nums[i],nums[j],sum);
    //                 Collections.sort(triplet);
    //                 set.add(triplet);
    //             }
    //         seen.add(nums[j]);
    //         }
    //     }
    //     return new ArrayList<>(set);
    // }

    // -------- optimal (using two pointer) --------
    public List<List<Integer>> threeSum(int[] nums) {
        // Optimal Approach
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum>0){
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left]==nums[left+1]) left++;
                    while(right>left && nums[right]==nums[right-1]) right--;
                    left++;
                    right--;
                }
            }
        }
        return res;
    }
}