class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int current = nums[left] + nums[right];
            if (current == target) return new int[] { left + 1, right + 1 };
            else if (current > target) right--;
            else left++;
        }

        return new int[2];
    }
}
