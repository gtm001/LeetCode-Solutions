class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            arr[c1-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char c2 = t.charAt(i);
            arr[c2-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}