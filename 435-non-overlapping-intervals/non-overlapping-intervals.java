class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int count = 0;
        int n = intervals.length;
        int prevEnd = intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<prevEnd){
                count++;
                prevEnd = Math.min(intervals[i][1],prevEnd);
            }
            else{
                prevEnd = intervals[i][1];
            }
        }
        return count;
    }
}