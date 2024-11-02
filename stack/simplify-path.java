class Solution {
    public String simplifyPath(String path) {
        Stack<String > stack = new Stack<>();
        String[] str = path.split("/");
        for(String s : str){
            if(s.isEmpty())continue;
            if(s.equals("..")){
                if (!stack.isEmpty()){stack.pop();}
            }else if( !s.equals(".")){
                stack.push(s);
            }
        }
        return "/" + String.join("/", stack);
    }
}