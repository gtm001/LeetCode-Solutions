class Solution {
    public static boolean isPunishment(int val,int target){
        if(val<target || target<0){
            return false;
        }
        if(val==target){
            return true;
        }
        return (isPunishment(val/10,target-(val%10)) || isPunishment(val/100,target-(val%100))|| isPunishment(val/1000,target-(val%1000)));
    }
    public int punishmentNumber(int n) {
        int punishValue = 0;
        for(int i = 1;i<=n;i++){
            int pow = i*i;
            int target = i;
            if(isPunishment(pow,target)){
                punishValue+=pow;
            }
        }
        return punishValue;
    }
}