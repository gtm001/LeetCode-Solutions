class Solution {
    public int maxFreqSum(String s) {
        int v = 0;
        int c = 0;
        String str = s.toLowerCase();
        int frq[] = new int[26];
        for(int i=0;i<s.length();i++){
            frq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u'){
                v = Math.max(v,frq[str.charAt(i)-'a']);
            }
            else{
                c = Math.max(c,frq[str.charAt(i)-'a']);
            }
        }
        return v+c;
    }
}