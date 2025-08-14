class Solution {
    public String largestGoodInteger(String num) {
        char [] arr = num.toCharArray();
        int res = -1;

        for(int i = 0; i< arr.length-2;i++){
            
            if(arr[i] == arr[i+1]&&arr[i]==arr[i+2]){
                int n = (int) arr[i];
                res = Math.max(res, arr[i]-'0');
            }
        }
        if(res == -1) return "";
        return res == 0? "000":Integer.toString(res*111);
    }
}