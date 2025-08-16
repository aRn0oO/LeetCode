class Solution {
    public int maximum69Number (int num) {
       int add= 0, step = 3, temp = num;
       while(temp> 0){
        int d = temp%10;
        temp /=10;

        if(d == 6) add = step;
        step *= 10;
       }
       return num + add;

    }
}