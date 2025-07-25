class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int maxArea = 0;
        int minH = 0;
        while(l<r){
            int xval = r-l;
            minH = Math.min(height[l],height[r]);
            int area = xval*minH;
            maxArea = Math.max(maxArea,area);
            if(height[l]>height[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return maxArea;
    }
}