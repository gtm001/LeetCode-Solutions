class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> setr = new HashSet<>();
        int n = nums1.length;
        int m = nums2.length;

        for(int i=0;i<n;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<m;i++){
            if(set.contains(nums2[i])){
                setr.add(nums2[i]);
            }
        }
        int res[] = new int[setr.size()];
        int l=0;
        for(int v:setr){
            if(l<setr.size()){
            res[l++] = v;
            }
        }
        
        return res;
    }
}