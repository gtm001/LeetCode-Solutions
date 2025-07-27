class Solution {
    public int subarraySum(int[] nums, int k) {

        // -------- Brute Force O(n^2) -------------
        // int count = 0;
        //  for(int i=0;i<nums.length;i++){
        //     int sum = 0;
        //     for(int j=i;j<nums.length;j++){
        //         sum +=nums[j];
        //         if(sum==k){
        //             count++;
        //         }
        //     }
        //  }
        //  return count;

        // --------- Optimal Approach using prefixSum and hashMap -----------------
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int count = 0;
        map.put(0,1);
        // pSum(i,j) = pSum(j)-pSum(i-1);
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}