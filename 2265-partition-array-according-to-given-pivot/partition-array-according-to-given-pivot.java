class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr[] = new int[nums.length];
        int cl = 0;
        int ce = 0;
        int cg = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                cl++;
            }
            else if(nums[i]>pivot){
                cg++;
            }
            else{
                ce++;
            }
        }
        int idxL = 0;
        int idxE = cl;
        int idxG = cl+ce;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
            arr[idxL++]=nums[i];
            }
            else if(nums[i]==pivot){
                arr[idxE++]=nums[i];
            }
            else{
                arr[idxG++]=nums[i];
            }
        }
 
        return arr;
    }
}