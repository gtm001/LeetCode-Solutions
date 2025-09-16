class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        rotArr(nums,0,n-1);
        rotArr(nums,0,k-1);
        rotArr(nums,k,n-1);
    }
    public static void rotArr(int[] nums,int l,int r){
        while(l<r){
            int t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;
            l++;
            r--;
        }
    }
}