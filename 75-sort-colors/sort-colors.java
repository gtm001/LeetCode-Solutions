class Solution {
    public void sortColors(int[] nums) {
        int s = 0;
        int m = 0;
        int e = nums.length-1;
        while(m<=e){
            switch(nums[m]){
                case 0:
                swap(nums,s,m);
                s++;
                m++;
                break;

                case 1:
                m++;
                break;

                case 2:
                swap(nums,m,e);
                e--;
                break;
            }
        }
    }
    public static void swap(int[] nums,int pos1,int pos2){
        int t = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = t;
    }
}