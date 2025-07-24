class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Better Approach
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> seen =new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int sum = -(nums[i]+nums[j]);
                if(seen.contains(sum)){
                    List<Integer> triplet = Arrays.asList(nums[i],nums[j],sum);
                    Collections.sort(triplet);
                    set.add(triplet);
                }
            seen.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}