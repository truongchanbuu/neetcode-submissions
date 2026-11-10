class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>(); // space - O(n) = nums len
        for (int n : nums) { // time - O(n)
            if (!seen.add(n)) return true;
        }

        return false;
    }
}