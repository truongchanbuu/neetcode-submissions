class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int max = 0, buy = 0, sell = 1;
        while (sell < prices.length) {
            if (prices[buy] < prices[sell]) max = Math.max(max, prices[sell] - prices[buy]);
            else buy = sell;
            sell++;
        }
        return max;
    }
}
