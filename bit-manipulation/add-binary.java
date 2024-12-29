class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();

        int n = a.length()-1;
        int m = b.length()-1;
        int carry = 0;
        while(n>=0|| m>= 0 ){
            int sum = carry;
            if(n>= 0) sum+= a.charAt(n--) -'0';
            if(m>= 0) sum += b.charAt(m--) - '0';

            carry = sum>1? 1:0;
            res.append(sum%2);
        }
        if (carry!= 0) res.append(carry);
        return res.reverse().toString();
    }
}