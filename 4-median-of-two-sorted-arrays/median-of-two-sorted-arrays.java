class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // int n1 = nums1.length;
        // int n2 = nums2.length;
        // int l = n1+n2;
        // int newA[] = new int[l];
        // for(int i=0;i<n1;i++){
        //     newA[i] = nums1[i];
        // }
        // for(int i=0;i<n2;i++){
        //     newA[n1+i] = nums2[i];
        // }
        // Arrays.sort(newA);
        // double med = 0;
        // if((l%2)!=0){
        //     med = newA[l/2];
        // }
        // else{
        //     med = (newA[l / 2] + newA[(l / 2) - 1]) / 2.0;
        // }
        // return med;

        // ---------TC - N(logN)----------.

        // --------- Also without using Array Sort(Using Merge Sort)-------------
        // int n1 = nums1.length;
        // int n2 = nums2.length;
        // int n = n1+n2;
        // int newA[] = new int[n];
        // int k = 0; // to track the index of new Array!

        // int i = 0;
        // int j = 0;
        // while(i<n1 && j<n2){
        //     if(nums1[i]>nums2[j]){
        //         newA[k++] = nums2[j++];
        //     }
        //     else{
        //         newA[k++] = nums1[i++];
        //     }
        // }
        // while(i<n1){
        //     newA[k++] = nums1[i++];
        // }
        // while(j<n2){
        //     newA[k++] = nums2[j++];
        // }
        // double med = 0;
        // if((n%2)!=0){
        // med = newA[n/2];
        // }
        // else{
        //     med = (newA[n / 2] + newA[(n / 2) - 1]) / 2.0;
        //      }
        // return med;
        //-------- TC - O(m+n) ----------------

        // ----------------- Optimize Code using Binary Search -----------------
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2;
        double med = 0;
        if(n1>n2){
            return findMedianSortedArrays(nums2,nums1);
        }
        int leftAsize = (n1+n2+1)/2;
        // we'll do all operation of Binary Search on Left Array.

        int low = 0;
        int high = n1;
        while(low<=high){
        int mid1 = low+(high-low)/2;
        int mid2 = leftAsize - mid1;

        int l1 = Integer.MIN_VALUE;
        int r1 = Integer.MAX_VALUE;
        int l2 = Integer.MIN_VALUE;
        int r2 = Integer.MAX_VALUE;

        if(mid1<n1){
            r1 = nums1[mid1];
        }
        if(mid2<n2){
            r2 = nums2[mid2];
        }
        if((mid1-1)>=0){
            l1 = nums1[mid1-1];
        }
        if((mid2-1)>=0){
            l2 = nums2[mid2-1];
        }

        if(l1<=r2 && l2<=r1){
            if(n%2==1){
                med = Math.max(l1,l2);
            }
            else{
                med = (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            }
        }
        if(l1>r2){
            high = mid1-1;
        }
        else{
            low = mid1+1;
        }
    }
    return med;

    }
}