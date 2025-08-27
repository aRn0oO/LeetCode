class Solution {
    public int reverse(int x) {
        if(x<0) return -1*reverse(-1*x);
        int res = 0;
        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str).reverse();
        try {res = Integer.parseInt(sb.toString());}
        catch(NumberFormatException e) {return 0;}
        return res;
    }
}