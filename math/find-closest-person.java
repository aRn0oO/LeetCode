class Solution {
    public int findClosest(int x, int y, int z) {
        int i = Math.abs(x-z), j = Math.abs(y-z);

        return i==j ? 0 : (i<j)?1:2;
    }
}