class Solution {
    public int firstUniqChar(String s) {
        int frq[] = new int[26];
        int idx = -1;
        for(int i=0;i<s.length();i++){
            frq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(frq[s.charAt(i)-'a']==1){
                idx = s.indexOf(s.charAt(i));
                break;
            }
        }
        return idx;
    }
}