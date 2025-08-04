class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int l = n1+n2;
        int newA[] = new int[l];
        for(int i=0;i<n1;i++){
            newA[i] = nums1[i];
        }
        for(int i=0;i<n2;i++){
            newA[n1+i] = nums2[i];
        }
        Arrays.sort(newA);
        double med = 0;
        if((l%2)!=0){
            med = newA[l/2];
        }
        else{
            med = (newA[l / 2] + newA[(l / 2) - 1]) / 2.0;
        }
        return med;
    }
}