class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        Set<Integer> map = new HashSet<>();
        int maxLen = 0;
        for(int val:arr){
            map.add(val);
        }
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int a = arr[i];
                int b = arr[j];
                int len = 2;
                while(map.contains(a+b)){
                    int temp = a+b;
                    a=b;
                    b=temp;
                    maxLen = Math.max(maxLen,++len);
                }
            }
        }
        return maxLen;
    }
}