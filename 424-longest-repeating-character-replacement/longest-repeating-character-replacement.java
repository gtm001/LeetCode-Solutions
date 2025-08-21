class Solution {
    public int characterReplacement(String s, int k) {
    //     int maxLen = 0;
    //     for(int i=0;i<s.length();i++){
    //     int freq[] = new int[26];
    //         int maxfreq = 0;
    //         for(int j=i;j<s.length();j++){
    //             freq[s.charAt(j)-'A']++;
    //             maxfreq = Math.max(maxfreq,freq[s.charAt(j)-'A']); // it stores the maximun freq of the character!
    //             int changes = (j-i+1) - maxfreq;
    //             if((changes)<=k){
    //                 maxLen = Math.max(maxLen,j-i+1);
    //             }
    //         }
    //     }
    //     return maxLen;
    // }

    // --- So, here Brute-Force will not work, it'll give TLE! ------------
    // Sliding window!

    int n = s.length();
    int left = 0;
    int right = 0;
    int maxLen = 0;
    int maxf = 0;
        int frq[] = new int[26];
    while(right<n){
        frq[s.charAt(right)-'A']++;
        maxf = Math.max(maxf,frq[s.charAt(right)-'A']);
        int change = (right-left+1)-maxf;
        if(change>k){
            frq[s.charAt(left)-'A']--;
            left++;
        }
        else{
            maxLen = Math.max(maxLen,right-left+1);
        }
        right++;
    }

    return maxLen;
    }


}