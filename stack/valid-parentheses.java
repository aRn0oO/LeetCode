class Solution {
    public boolean isValid(String s) {
        Stack<Character> list = new Stack<>();
        char [] array = s.toCharArray();
        for (char sym : array){
            if (sym == '('||sym == '{'||sym== '['){list.push(sym);}
            else if (sym == ')' && (list.isEmpty() || list.pop() != '(')){
                return false;}
            else if (sym == '}'&&(list.isEmpty()|| list.pop() != '{')){return false;}
            else if (sym == ']'&&(list.isEmpty()||list.pop() != '[')){return false;}
            

        }
        return list.isEmpty();
    }
}