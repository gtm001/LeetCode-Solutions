class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<word.length();i++){
            map.put(word.charAt(i),i);
        }
        for(Character key: map.keySet()){
            if(Character.isLowerCase(key) && word.contains(String.valueOf((Character.toUpperCase(key))))){
                count++;
            }
        }
        return count;
    }
}