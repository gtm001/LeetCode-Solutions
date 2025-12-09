class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = Integer.MAX_VALUE;
        int val = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            minSoFar = Math.min(minSoFar,prices[i]);
            int profit = prices[i]-minSoFar;
            val = Math.max(val,profit);
        }
          return val;
    }
}