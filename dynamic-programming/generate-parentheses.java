class Solution {
    public List<String> generateParenthesis(int n) {
        List <String> arr = new ArrayList<>();
        back(n,arr,0,0,"");
        
        return arr;
                
    }
    void back(int b,List <String> arr,int left, int right, String s){
            if(left<right){return;}
            if (s.length() == b* 2){
                arr.add(s);
                return;
            }
            if (left<b){
                back(b,arr, left+1,right,s+"(");
            }
            if(left>right){back(b, arr, left, right+1,s+")");}
        }
}