class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int arr[] = new int[3];// to check the frequency of 'a','b' and 'c'.
        int left = 0;
        int count = 0;
        for(int right=0;right<n;right++){
            arr[s.charAt(right)-'a'] = arr[s.charAt(right)-'a']+1;
            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                count = count+(n-right);
                arr[s.charAt(left)-'a'] = arr[s.charAt(left)-'a']-1; // shrinking window by updating left
                left++;
            }
        }
        return count;
    }
}