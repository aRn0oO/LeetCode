import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, 0, 4, (long) target);
    }

    private List<List<Integer>> kSum(int[] nums, int start, int k, long target) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (start >= n || k < 2) return res;

        // --- PRUNING: compute min and max possible sum with k numbers ---
        long min = 0L, max = 0L;
        for (int i = 0; i < k; i++) {
            if (start + i >= n || n - 1 - i < 0) return res; // safety
            min += nums[start + i];
            max += nums[n - 1 - i];
        }
        if (target < min || target > max) return res;

        if (k == 2) {
            int l = start, r = n - 1;
            while (l < r) {
                long sum = (long) nums[l] + nums[r];
                if (sum < target) {
                    l++;
                } else if (sum > target) {
                    r--;
                } else {
                    res.add(Arrays.asList(nums[l], nums[r]));
                    int a = nums[l], b = nums[r];
                    while (l < r && nums[l] == a) l++;  // skip dups
                    while (l < r && nums[r] == b) r--;  // skip dups
                }
            }
            return res;
        }

        for (int i = start; i <= n - k; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue; // dedupe
            long newTarget = target - nums[i];
            for (List<Integer> tail : kSum(nums, i + 1, k - 1, newTarget)) {
                tail.add(0, nums[i]);
                res.add(tail);
            }
        }
        return res;
    }
}
