class Solution {
    boolean res = false;   
    final double eqs = 0.001;
    public boolean judgePoint24(int[] cards) {
        List<Double> list = new ArrayList<>();    

        for(int n : cards){
            list.add((double)n);
        }

        helper(list);

        return res;
    }

    private void helper(List<Double> list){
        if(res) return;
        if(list.size()==1){
            if(Math.abs(list.get(0)-24.0)< eqs) res = true;

            return; 
        }
        for(int i = 0; i< list.size(); i++){
            for(int j = 0; j < i; j ++){
                List<Double> next = new ArrayList<>();
                Double p1 = list.get(i), p2 = list.get(j);
                next.addAll(Arrays.asList(p1+p2, p1-p2, p2-p1, p1*p2));

                if(Math.abs(p2) > eqs) next.add(p1/p2);
                if(Math.abs(p1) > eqs) next.add(p2/p1);
                
                list.remove(i);
                list.remove(j);

                for(Double n : next){
                    list.add(n);
                    helper(list);
                    list.remove(list.size()-1);

                }

                
                list.add(j,p2);
                list.add(i, p1);
            }
        }
        

    }
}