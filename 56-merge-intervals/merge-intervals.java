class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        int i = 0;
        while(i<intervals.length){
        int start = intervals[i][0];
        int end = intervals[i][1];
        while(i+1<intervals.length && intervals[i+1][0]<=end){
            end = Math.max(intervals[i+1][1],end);
            i++;
        }
        list.add(new int[]{start,end});
        i++;
        }

        int tdarr[][] = new int[list.size()][2];
        for(int j=0;j<list.size();j++){
            tdarr[j] = list.get(j);
        }
        return tdarr;
    }
}