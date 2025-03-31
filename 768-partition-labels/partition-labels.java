class Solution {
    public List<Integer> partitionLabels(String s) {
        int last_indx[] = new int[26];

        // Store the last occurrence index of each character
        for(int i=0;i<s.length();i++){
            last_indx[s.charAt(i)-'a'] = i;
        }

        // Partition the String
        ArrayList<Integer> arr = new ArrayList<>();
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            end = Math.max(end,last_indx[s.charAt(i)-'a']);
            if(i==end){
                arr.add(end-start+1);
                start = i+1;
            }
        }
        return arr;
    }
}