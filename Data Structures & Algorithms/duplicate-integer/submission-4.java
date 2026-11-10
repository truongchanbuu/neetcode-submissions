class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; ++i) {
            for (int j = i - 1; j >= 0; --j) {
                if (nums[i] == nums[j]) return true;
            }
        }

        return false;
    }
}