class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<word.length();i++){
            map.put(word.charAt(i),i);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(Character.isLowerCase(entry.getKey()) && word.contains(String.valueOf((Character.toUpperCase(entry.getKey()))))){
                count++;
            }
        }
        return count;
    }
}