class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 1){
            List<List<Integer>> result = new ArrayList<>();
            result.add(List.of(1));
            return result;
        }

        List<List<Integer>> prev = generate(numRows-1);
        List<Integer> newRow = new ArrayList<>();

        for(int i = 0; i <numRows;i++){
            newRow.add(1);
        }

        for(int i = 1; i < numRows -1;i++){
            newRow.set(i,prev.get(numRows-2).get(i-1)+prev.get(numRows-2).get(i));
        }

        prev.add(newRow);
        return prev;
    }
}