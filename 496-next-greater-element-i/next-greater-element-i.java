class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            int num = nums2[i];

            while(!st.isEmpty() && st.peek()<=num){ // removing things which are eual or less than num[i].
                st.pop();
            }

            int nxtgrter = st.isEmpty()?-1:st.peek();
            map.put(num,nxtgrter);
            st.push(num);
        }
        int res[] = new int[nums1.length];
        for(int i=0;i<res.length;i++){
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}