class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int cur = nums[left] + nums[right];
            if (cur == target) return new int[] { left + 1, right + 1 }; 
            else if (cur < target) left++;
            else right--;
        }

        return new int[0];
    }
}
