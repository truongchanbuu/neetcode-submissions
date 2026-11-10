class Solution {
    // input: heights = nums[]
    // output: max area
    // meaning: finding a area where it is the highest value
    public int maxArea(int[] heights) {
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int area = Math.min(heights[left], heights[right]) * (right - left);
            max = Math.max(area, max);
            if (heights[left] < heights[right]) left++;
            else right--;
        }

        return max;
    }
}
