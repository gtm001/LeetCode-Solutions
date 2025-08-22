class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        for(int i=0;i<sb.length()/2;i++){
            char chf = sb.charAt(i);
            char che = sb.charAt(sb.length()-1-i);
            if(chf!=che){
                return false;
            }
        }
        return true;
    }
}