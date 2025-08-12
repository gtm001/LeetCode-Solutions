class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        // step 1.(finding pivot)
        for(int i=n-2;i>=0;i--){
            if(nums[i+1]>nums[i]){
                pivot = i;
                break;
            }
        }
        if(pivot==-1){
            reverse(nums,0,n-1);
            return;
        }

        for(int j=n-1;j>pivot;j--){
            if(nums[j]>nums[pivot]){
                // swap(nums[j+1],nums[i])
                int temp = nums[j];
                nums[j] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }
        reverse(nums,pivot+1,n-1);
    }
        // reverse fxn
        public static void reverse(int[] arr,int start,int end){
            while(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
}