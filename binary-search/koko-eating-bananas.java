class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        
        int eat = -1;
        int l = 1, r = piles[piles.length-1];
    
        while(l<r){
            eat = l+r/2;
            int currhour = 0;
            for(int i : piles)
                currhour+= (i/eat) + (i%eat ==0? 0:1);
            
            
            if(currhour > h)   
                l = eat+1;
            else r = eat-1;
        }

        return eat;
    }
}