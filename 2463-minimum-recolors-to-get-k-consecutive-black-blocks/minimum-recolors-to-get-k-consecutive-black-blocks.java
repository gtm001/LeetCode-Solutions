class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minRecolor = Integer.MAX_VALUE;
        int countWhite = 0;

        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                countWhite++;
            }
        }
        minRecolor = countWhite;

        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i-k)=='W'){
                countWhite--;
            }
            if(blocks.charAt(i)=='W'){
                countWhite++;
            }
            minRecolor=Math.min(minRecolor,countWhite);
        }
        return minRecolor;
    }
}