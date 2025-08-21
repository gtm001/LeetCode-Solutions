class Solution {
    // public boolean isAnagram(String s, String t) {
    //     int[] arr1 = new int[26];
    //     int[] arr2 = new int[26];
    //     if(s.length()!=t.length()){
    //         return false;
    //     }
    //     int n = s.length();
    //     int c1 = 0;
    //     int c2 = 0;
    //     for(int i=0;i<n;i++){
    //         char ch = s.charAt(i);
    //         arr1[ch-'a']++;
    //         c1 += arr1[ch-'a'];
    //     }

    //     for(int i=0;i<n;i++){
    //         char ch = t.charAt(i);
    //         arr2[ch-'a']++;
    //         c2 += arr2[ch-'a'];
    //     }

    //      for(int i=0;i<26;i++){
    //             if(arr1[i] != arr2[i]){
    //                     return false; // mismatch in frequency
    //             }

                             
    //      }
    //      return true;
    // }

    // --------- Sorting the code ------------------
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int n = s.length();
        int arr[] = new int[26];
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int val:arr){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}