class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        long timeT = 0;
        int speed = Integer.MAX_VALUE;
        for(int num:piles){
            high = Math.max(num,high);
        }
        while(low<=high){
            int mid = low+(high-low)/2; //speed of eating per hour.
            timeT = 0;
            for(int val:piles){
                timeT = timeT+(val/mid);
                if((val%mid)!=0){
                    timeT++;
                }
            }
            if(timeT <=h){
                speed = Math.min(speed,mid);
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return speed;
    }
}