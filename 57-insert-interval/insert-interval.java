// class Solution {
//     public int[][] insert(int[][] intervals, int[] newInterval) {
//         List<List<Integer>> list = new ArrayList<>();
//         for(int i=0;i<intervals.length;i++){
//                 List<Integer> arr = new ArrayList<>();
//                 if((newInterval[0]<intervals[i][0]) && (newInterval[1]<intervals[i][1])){
//                     arr.add(intervals[i][0]);
//                     arr.add(intervals[i][1]);
//                     list.add(arr);
//                 }
//                 else if(newInterval[0]<intervals[i][0] && i>0){
//                     arr.add(intervals[i-1][0]);
//                     list.add(Arrays.asList(arr));
//                 }
//                 else if(newInterval[1]<intervals[i][1]){
//                     arr.add(intervals[i][1]);
//                     list.add(Arrays.asList(arr));
//                 }
//                 else{
//                     arr.add(intervals[i][0]);
//                     arr.add(intervals[i][1]);
//                     list.add(Arrays.asList(arr));
//                 }
//             }

//             // copyingg things in 2d array;
//             int tdarr[][] = new int[arr.size()][2];
//             for(int i=0;i<arr.size();i++){
//                 for(int j=0;i<2;j++){
//                     tdarr[i][j] = list.get(i).get(j);
//                 }
//             }
//         }
//         return tdarr;
//     }
// }

class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
                List<int[]> list = new ArrayList<>();
                        int i = 0;

                                // Add all intervals before newInterval
                                        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
                                                    list.add(intervals[i]);
                                                                i++;
                                                                        }

                                                                                // Merge overlapping intervals
                                                                                        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
                                                                                                    newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                                                                                                                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
                                                                                                                            i++;
                                                                                                                                    }
                                                                                                                                            list.add(newInterval);

                                                                                                                                                    // Add remaining intervals
                                                                                                                                                            while (i < intervals.length) {
                                                                                                                                                                        list.add(intervals[i]);
                                                                                                                                                                                    i++;
                                                                                                                                                                                            }

                                                                                                                                                                                                    // Convert list to 2D array
                                                                                                                                                                                                            int[][] result = new int[list.size()][2];
                                                                                                                                                                                                                    for (int j = 0; j < list.size(); j++) {
                                                                                                                                                                                                                                result[j] = list.get(j);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                return result;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    }

