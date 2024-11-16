class Solution {
    public String minWindow(String s, String t) {
        if(s.length()< t.length()) return "";
        Map<Character, Integer> map = new HashMap<>();
        for(char i : t.toCharArray())map.put(i, map.getOrDefault(i,0)+1);

        int remain = t.length();
        int [] window = {0,Integer.MAX_VALUE};
        int start = 0;

        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)&& map.get(ch) > 0 ){
                remain--;
            }
            map.put(ch,map.getOrDefault(ch,0)-1 );
            if(remain==0){
                while(true){
                    char charAtStart = s.charAt(start);
                    if(map.containsKey(charAtStart)&& map.get(charAtStart)==0 ) break;

                    map.put(charAtStart, map.getOrDefault(charAtStart,0)+1);
                    start++;
                }
                if(i-start<window[1]-window[0]){
                    window[0] = start;
                    window[1] = i;
                }

                map.put(s.charAt(start), map.getOrDefault(s.charAt(start), 0)+1 );
                remain ++;
                start++;
            }
            

        }

        return window[1]>=s.length()? "" : s.substring(window[0],window[1]+1);

    }
}       