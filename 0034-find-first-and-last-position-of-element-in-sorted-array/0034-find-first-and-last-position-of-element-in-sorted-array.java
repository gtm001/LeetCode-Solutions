// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int arr[] = new int[2];
//         int j = 0;
//         boolean flag = false;
        
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==target){
//                 flag = true;
//                 arr[j] = i;
//                 j++;

//                 if(j==2){
//                     break;
//                 }
            
//         }
// }
//         if(!flag){
//             arr[0] = -1;
//             arr[1] = -1;
//         }
    
//         return arr;
// }
// }


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = {-1, -1}; // Initialize with -1
        boolean flag = false;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (!flag) { // First occurrence
                    arr[0] = i;
                    flag = true;
                }
                arr[1] = i; // Always update last occurrence
            }
        }
        
        return arr;
    }
}
