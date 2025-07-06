class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num: nums){
            xor = xor ^ num;
        }
        // now, finding rightmost set bit
        int setBit = (xor) & (-xor);
        int res[] = new int[2];
        for(int num:nums){
            if((setBit & num )!= 0){
                res[0]^=num;
            }
            else{
                res[1]^=num;
            }
        }
        return res;
    }
}