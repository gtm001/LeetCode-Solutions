// class Solution {
//     public String longestPalindrome(String s) {
//         if(s.length()<=1){
//             return s;
//         }
//         String res = "";
//         for(int i=0;i<s.length();i++){
//             for(int j=i;j<s.length();j++){
//                 String sub = s.substring(i,j+1);
//                 if(isPelindrome(sub)){
//                     if(sub.length()>res.length()){
//                         res = sub;
//                     }
//                 }
//             }
//         }
//         return res;
//     }
//     public static boolean isPelindrome(String s){
//         int l = 0;
//         int r = s.length()-1;
//         while(l<r){
//             if(s.charAt(l)!=s.charAt(r)){
//                 return false;
//             }
//             l++;
//             r--;
//         }
//         return true;
//     }
// }

// ------- Above one is not optimize in term of Space Complexity! - --------- so let's optimize it,-------------
class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        int maxLen = 1;
        int start = 0;
        for(int i=0;i<s.length();i++){
            int l1 = expCenLen(s,i,i); //odd len
            int l2 = expCenLen(s,i,i+1); //even len
            int len = Math.max(l1,l2);
            if(len>maxLen){
                maxLen = len;
                start = i-(len-1)/2;
            }
        }
        return s.substring(start,start+maxLen);
    }
    public static int expCenLen(String s,int left,int right){
 
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
    return right-left-1;       
    }
}