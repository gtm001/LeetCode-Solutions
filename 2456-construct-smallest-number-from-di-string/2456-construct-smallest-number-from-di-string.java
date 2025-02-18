import java.util.*;
class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int n = pattern.length();
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++){
            arr[idx] = i+1;
            idx = idx +1;

            if(i==n || pattern.charAt(i)=='I'){
                while(idx>0){
                idx = idx - 1;
                sb.append(arr[idx]);
                }
            }

        }
        return sb.toString();
    }
}