class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        for(int right = 0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
                set.add(s.charAt(right));
                max=Math.max(max,right-left+1);
        }
        return max;
    }
}

// -----------In bt if we take reference from array then
// to find the left child of an idex it will be 2i+1
// for right 2i+2
// for present i-1/2