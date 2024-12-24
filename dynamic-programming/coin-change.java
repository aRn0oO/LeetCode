class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount< 0) return -1;
        if( amount == 0) return 0;
        int res = -1;
        for(int i = 0; i<coins.length; i++){
            int coin = coinChange( coins, amount- coins[i]);
            if(coin>= 0) res = res<0? coin +1:Math.min(res,coin+1 );
        }
        return res;
    }
}