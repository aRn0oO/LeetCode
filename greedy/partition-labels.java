class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map  = new HashMap<>();
        char[] charArr = s.toCharArray();
        int n = charArr.length;

        for (int i = 0;i< n; i++){
            map.put(charArr[i],i);
        }
        List<Integer> result = new ArrayList<>();

        int start = 0, end = 0;

        for(int i = 0; i< n;i++){
            end = Math.max(map.get(charArr[i]), end);
            if(i == end){
                result.add(end-start+1);
                start  = i +1;
            }
        }
        return result;
    }
}