class Solution {
    public boolean hasDuplicate(int[] nums) {
        // 1. HashSet check item
        // Set<Integer> seen = new HashSet<>(); // space - O(n) = nums len
        // for (int n : nums) { // time - O(n)
        //     if (!seen.add(n)) return true;
        // }

        // return false;
    
        // 2. HashSet check length
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}