class Solution {
    public int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C',100);
        map.put('D', 500);
        map.put('M',1000);

        for(int i= 0; i<s.length()-1;i++){
            int num = map.get(s.charAt(i));
            if(num< map.get(s.charAt(i+1))){
                res -=num;
            }else res += num;
        }
        return res+ map.get(s.charAt(s.length()-1));
    }
}