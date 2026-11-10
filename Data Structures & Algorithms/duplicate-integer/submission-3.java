class Solution {
    public boolean hasDuplicate(int[] nums) {
        // 1. HashSet check item
        // Set<Integer> seen = new HashSet<>(); // space - O(n) = nums len
        // for (int n : nums) { // time - O(n)
        //     if (!seen.add(n)) return true;
        // }

        // return false;
    
        // 2. HashSet check length
        // return Arrays.stream(nums).distinct().count() < nums.length;

        // 3. Sorting
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i - 1]) return true;
        }

        return false;
    }
}