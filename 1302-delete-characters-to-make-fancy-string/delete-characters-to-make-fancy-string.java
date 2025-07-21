class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(i>0 && s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                count = 1;
            }
            if(count<3){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}