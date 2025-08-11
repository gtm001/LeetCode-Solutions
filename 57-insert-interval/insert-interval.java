class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int i = 0;
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            list.add(intervals[i]);
            i++;
        }
        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        list.add(newInterval);
        while(i<intervals.length){
            list.add(intervals[i]);
            i++;
        }


    int[][] res = new int[list.size()][2];
    // for(int k=0;k<res.length;k++){
    //     for(int j=0;j<2;j++){
    //         res[k][j] = list.get(k)[j];
    //     }
    // }
    // don't need double for loop, coz since we do have taken List<int[]>

    for(int j=0;j<res.length;j++){
        res[j] = list.get(j);
    }
    return res;
    }
}