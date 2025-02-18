class Solution {
    public boolean isPalindrome(int x) {
    int ori = x;
    int val = 0;
        while(x>0){
            int d = x%10;
            val = val*10+d;
            x = x/10;
        }
        if(ori==val){
            return true;
        }
        else{
            return false;
        }
    }
}