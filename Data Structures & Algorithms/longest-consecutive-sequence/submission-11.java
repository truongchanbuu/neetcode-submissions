    class Solution {
        // inpt: nums = int[]
        // output: len(repeat)
        public int longestConsecutive(int[] nums) {
            if (nums.length == 0) return 0;
            HashSet<Integer> seen = new HashSet<>();
            for (int n : nums)
                seen.add(n);
                
            int count = 0, max = 0;
            for (int n : nums) {
                int cur = n;
                if (seen.contains(n + 1)) continue;
                while (seen.contains(cur - 1)) {
                    count++;
                    cur -= 1;
                }

                max = Math.max(max, count);
                count = 0;
            }

            return max + 1;
        }
    }
