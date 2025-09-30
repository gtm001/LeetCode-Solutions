class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        while(n!=1){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0;i<n-1;i++){
                int sum = 0;
                sum = nums[i]+nums[i+1];
                if(sum>=10){
                    arr.add(sum%10);
                }
                else{
                    arr.add(sum);
                }
                
            }
            for(int i=0;i<arr.size();i++){
                nums[i] = arr.get(i);
            }
            n--;
        }
        return nums[0];
    }
}