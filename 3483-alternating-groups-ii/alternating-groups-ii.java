class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int countAlt = 1;
        int count = 0;
        int n = colors.length;
        for(int i=1;i<n+k-1;i++){
            int curr = i%n;
            int prev = (i-1)%n;

            if(colors[prev]!=colors[curr]){
                countAlt++;
            }
            else{
                countAlt = 1;
            }
            if(countAlt>=k){
                count++;
            }
        }
        return count;
    }
}

// Remember if you waht to find a substring in an Linear array then you have to iterate till " i<n-k+1",
// but in case of circular it should be "i<n+k-1".