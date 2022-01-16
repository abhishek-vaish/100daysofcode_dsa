// https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++)
            max = Math.max(max, nums[i]);

        int[] counter = new int[max];

        for (int i = 0; i < nums.length; i++)
            counter[nums[i] - 1]++;

        int ans = 0;

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 1) {
                ans = i + 1;
            }
        }

        return ans;
    }
}