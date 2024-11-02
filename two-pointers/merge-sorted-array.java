class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1 , j = n-1;
        for(int r = m+n-1; r>=0; r--){
            if(j<0) break;
            if(i<0) {
                nums1[r]= nums2[j];
                j--;
            }
            else if(nums1[i]>nums2[j]){
                nums1[r] = nums1[i];
                i--;
            }else{
                nums1[r] = nums2[j];
                j--;
            }
        }
        

    }
}