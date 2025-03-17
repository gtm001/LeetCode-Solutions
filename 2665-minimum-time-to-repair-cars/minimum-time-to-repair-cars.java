class Solution {
    public long repairCars(int[] ranks, int cars) {
        long start = Long.MAX_VALUE;
        long end = Long.MIN_VALUE;
        for(int rank:ranks){
            start = Math.min(start,rank);
            end = Math.max(end,rank);
        }
        end = end*cars*cars;
        long ans = 0;
        while(start<=end){
        long mid = start+(end-start)/2;
        if(canRepaired(mid,ranks,cars)){
            ans=mid;
            end = mid-1;
        }
        else{
            start = mid+1;
        }
        }
        return ans;
    }
    public boolean canRepaired(long time,int[] ranks,long repairCar){
        long repairedCar = 0;
        for(int rank:ranks){
            repairedCar+=Math.sqrt(1.0*time/rank);
            if(repairedCar>=repairCar){
                return true;
            }
        }
        return false;
    }
}