class Solution {

    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<Character, String>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> output = new ArrayList<String>();
        if (digits.length()==0) return output;
        StringBuilder sb = new StringBuilder();
        solve(digits, 0, sb, output, map);
        return output;
    }
    private void solve(String digits, int idx, StringBuilder sb, List<String> output, Map<Character, String> map) {
        if (idx == digits.length()) {
            output.add(sb.toString());
            return;
        }

        char curr = digits.charAt(idx);
        for (char c : map.get(curr).toCharArray()) {
            sb.append(c);
            solve(digits, idx+1, sb, output, map);
            sb.deleteCharAt(sb.length()-1);
        }
    }

}