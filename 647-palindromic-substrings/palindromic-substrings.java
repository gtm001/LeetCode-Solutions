class Solution {
    public int countSubstrings(String s) {
        if(s.length()==1){
            return 1;
        }
        int count = 0;
        for(int i=0;i<s.length();i++){
            count+=expCent(s,i,i+1);
            count+=expCent(s,i,i);
        }
        return count;
    }
    public static int expCent(String s, int l,int r){
        int cnt = 0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            cnt++;
            l--;
            r++;
        }
        return cnt;
    }
}