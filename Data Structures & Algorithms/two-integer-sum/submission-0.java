class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; ++i) {
            int second = target - nums[i];
            if (!map.containsKey(second)) map.put(nums[i], i);
            else return new int[] { map.get(second), i };
        }

        return new int[2];
    }
}
