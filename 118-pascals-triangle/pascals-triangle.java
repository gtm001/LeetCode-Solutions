class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> valA = new ArrayList<>();
        int start = 1;
        if(numRows==1){
            valA.add(1);
            list.add(new ArrayList<>(valA));
        }
        else if(numRows==2){
            valA.add(1);
            list.add(new ArrayList<>(valA));
            valA.add(1);
            list.add(new ArrayList<>(valA));
        }
        else{
            valA.add(1); // row 1
            list.add(new ArrayList<>(valA));
            while(start<numRows){
                List<Integer> prevRow = list.get(start-1); // previous row
                List<Integer> newRow = new ArrayList<>();
                newRow.add(1);// first val of new row;

                //middle values
                for(int i=1;i<prevRow.size();i++){
                    newRow.add(prevRow.get(i-1)+prevRow.get(i));
                }
                newRow.add(1);
                list.add(newRow);
                start++;

        }
        }
        return list;
    }
}