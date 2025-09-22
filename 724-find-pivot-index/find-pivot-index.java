class Solution {
    public int pivotIndex(int[] nums) {
        int n1 = nums.length;
        int arrp[] = new int[n1];
        int arrs[] = new int[n1];
        int sp = 0;
        int ss = 0;

        for(int i=0;i<n1;i++){
            sp+=nums[i];
            arrp[i] = sp;
        }

        for(int i=n1-1;i>=0;i--){
            ss+=nums[i];
            arrs[i] = ss;
        }

        for(int i=0;i<n1;i++){
            int lsum = arrp[i]-nums[i];
            int rsum = arrs[i]-nums[i];
            if(lsum==rsum){
                return i;
            }
        }

        return -1;
    }
}