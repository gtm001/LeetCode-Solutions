class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res = map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            char right = s.charAt(i+1);
            char curr = s.charAt(i);
            if(map.get(curr)<map.get(right)){
                res-=map.get(curr);
            }
            else{
                res+=map.get(curr);
            }
        }
        return res;
    }
}