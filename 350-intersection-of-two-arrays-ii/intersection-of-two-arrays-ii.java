class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int frq[] = new int[1001];
        for(int i=0;i<nums1.length;i++){
            frq[nums1[i]-0]++;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int val:nums2){
            if(frq[val]>0){
                arr.add(val);
                frq[val]--;
            }
        }
        int res[] = new int[arr.size()];
        for(int i=0;i<res.length;i++){
            res[i] = arr.get(i);
        }
        return res;
    }
}