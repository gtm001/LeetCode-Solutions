// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int len = Integer.MAX_VALUE;
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//             int sum = 0;
//             for(int j=i;j<n;j++){
//                 sum+=nums[j];
//                 if(sum>=target){
//                     len = Math.min(len,(j-i+1));
//                 }
//             }
//         }
//         return len==Integer.MAX_VALUE?0:len;
//     }
// }

// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int l = 0;
//         int r = 0;
//         int n = nums.length;
//         int sum = 0;
//         int e = 0;
//         int len = Integer.MAX_VALUE;
//         while(r<=n-1){
//             sum+=nums[r];
//             if(sum>=target){
//                 len = Math.min(len,r-l+1);
//                 l++;
//                 r=l-1;
//                 sum = 0;
//             }
//             r++;
//         }
//         return len==Integer.MAX_VALUE?0:len;
//     }
// }

// ---------- Sliding Window --------------
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int l=0;
        int r = 0;
        int n = nums.length;
        int len = Integer.MAX_VALUE;
        while(r<n){
            sum+=nums[r];
            // shrinking
            while(sum>=target){
                len = Math.min(len,r-l+1);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return len==Integer.MAX_VALUE?0:len;
    }
}