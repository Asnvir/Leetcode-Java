class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = nums[0], curMax = nums[0], kadaneMax = nums[0],curMin = nums[0], kadaneMin = nums[0];

        for (int i = 1; i < nums.length; i++){
            int currNumber = nums[i];
            totalSum += nums[i];
            curMax = Math.max(currNumber, curMax + currNumber);
            kadaneMax = Math.max(curMax, kadaneMax);
            curMin = Math.min(currNumber, curMin + currNumber);
            kadaneMin = Math.min(curMin, kadaneMin);
        }

        return kadaneMax < 0 ? kadaneMax : Math.max(kadaneMax, totalSum - kadaneMin);
    }
}