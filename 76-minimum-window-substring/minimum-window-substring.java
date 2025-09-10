// class Solution {
//     public String minWindow(String s, String t) {
//         int m = s.length();
//         int n = t.length();
//         int minLen = Integer.MAX_VALUE;
//         int start = 0;
//         for(int i=0;i<m;i++){
//             int frq[] = new int[128];

//             // calulating frq of 2nd array.
//             for(int k=0;k<n;k++){
//                 frq[t.charAt(k)]++;
//             }
//             int count = 0;
//             for(int j=i;j<m;j++){
//                 frq[s.charAt(j)]--;
//                 if(frq[s.charAt(j)]>=0){
//                     count++;
//                 }
//                 if(count==t.length()){
//                     if((j-i+1)<minLen){
//                         minLen = j-i+1;
//                         start = i;
//                     }
//                 }
//             }
//         }
//         return minLen == Integer.MAX_VALUE?"":s.substring(start,start+minLen);

//     }
// }

// TLE - TC = O(m2+m*n)
//       SC = O(1)

// ----------------- Optimize Code ------------------------
class Solution{
    public String minWindow(String s,String t){
        int m = s.length();
        int n = t.length();
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        // calculate frq of String t.
        int frq[] = new int[256];
        for(int i=0;i<n;i++){
            frq[t.charAt(i)]++;
        }
        int l = 0;
        int r = 0;

        while(r<m){
            frq[s.charAt(r)]--;
            if(frq[s.charAt(r)]>=0){
                count++;

                while(count==n){
                    if(minLen>(r-l+1)){
                        minLen = r-l+1;
                        start = l;
                    }
                    // shrink
                    frq[s.charAt(l)]++;
                    if(frq[s.charAt(l)]>0){
                        count--;
                    }
                    l++;
                    
                }
            }
            r++;
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}