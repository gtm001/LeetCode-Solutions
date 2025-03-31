import java.util.Collections;
class Solution {
    public long putMarbles(int[] weights, int k) {
        // The sum of adjacent elements directly represents the cost of making a cut
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<weights.length-1;i++){
            arr.add(weights[i]+weights[i+1]);
        }
        Collections.sort(arr);
        long max = 0;
        long min = 0;

        for(int i=0;i<k-1;i++){
            min+= arr.get(i); // adding minimum score
            max+= arr.get(arr.size()-1-i); // adding maximum score
        }
        return max-min;
    }
}