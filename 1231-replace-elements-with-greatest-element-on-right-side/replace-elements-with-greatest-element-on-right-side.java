class Solution {
    public int[] replaceElements(int[] arr) {
        int res[] = new int[arr.length];
        for(int i=0;i<res.length-1;i++){
            int maxv = Integer.MIN_VALUE;
            for(int j=i+1;j<res.length;j++){
                maxv = Math.max(maxv,arr[j]);
            }
                res[i]=maxv;
        }
        res[res.length-1] = -1;
        return res;
    }
}