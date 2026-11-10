class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for (int num : nums) {
            boolean isAdded = set.add(num);
            if (!isAdded) return true;
        }

        return false;
    }
}