class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[nums1.length];
        int l=0;
        int h=arr.length;
        int l1 = 0;
        int l2 = 0;
        while(l1<m && l2<n){
            if(nums1[l1]<=nums2[l2]){
                arr[l++] = nums1[l1++];
            }
            else{
                arr[l++] = nums2[l2++];
            }
        }
        while(l1<m){
            arr[l++] = nums1[l1++];
        }
        while(l2<n){
            arr[l++] = nums2[l2++];
        }
        // copy back to nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }
    }
}