    class Solution {
        // inpt: nums = int[]
        // output: len(repeat)
        public int longestConsecutive(int[] nums) {
            if (nums == null || nums.length == 0) return 0;
            Arrays.sort(nums);
            int count = 0;
            int res = 0;

            for (int i = 0; i < nums.length - 1; ++i) {
                int cur = nums[i];
                int next = nums[i + 1];
                if (cur == next) continue;
                else if (cur != next - 1) count = 0;
                else count++;
                
                res = Math.max(res, count);
            }

            return res + 1;
        }
    }
