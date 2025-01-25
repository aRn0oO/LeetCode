class Solution {
    public static class pair{
        int element;
        int index;

        pair(int element, int index){
            this.element = element;
            this.index = index; 
        }
    }
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        List<pair> pairs= new ArrayList<>();
        for(int i = 0; i<n; i++)
            pairs.add(new pair(nums[i], i));
        pairs.sort(Comparator.comparingInt(p->p.element));

        List<List<pair>> res = new ArrayList<>(); 
        res.add(new ArrayList<>(Arrays.asList(pairs.get(0))));

        for(int i = 1; i< n; i++){
            if(pairs.get(i).element - pairs.get(i-1).element <= limit)
                res.get(res.size()-1).add(pairs.get(i));
            else res.add(new ArrayList<>(Arrays.asList(pairs.get(i))));
        }
        for(List<pair> group : res){
            List<pair> sortedGroup = new ArrayList<>(group);
            sortedGroup.sort(Comparator.comparingInt(p->p.index));
            for (int i = 0; i < group.size(); ++i)
                nums[sortedGroup.get(i).index] = group.get(i).element;

        }
        return nums;

        

    
    }
}