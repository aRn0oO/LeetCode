class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result = new int [2];
        result[0] = findFirst(nums,target);
        result[1] = findLast(nums, target);
        return result;
    }

    private int findFirst(int [] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int mid;
        int index =-1;
        while (l<=r){
            mid = (l+r)>>1;
            if(nums[mid] == target){
                index = mid;
                r=mid-1;
            }
            else if(nums[mid]>target)r = mid -1;
            else l = mid +1;
        }
        return index;
    }
    private int findLast(int[]nums , int target){
        int l = 0, r = nums.length-1;
        int mid; 
        int index = -1;
        while (l<=r){
            mid = (l+r)>>1;
            if(nums[mid] == target){
                index = mid;
                l=mid+1;
            }
            else if(nums[mid]>target)r = mid -1; 
            else l = mid +1;
        }
        return index;
    }
}