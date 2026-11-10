class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int effectiveProfit = 0;
        int buy = 0, sell = 1;
        while (sell < prices.length) {
            if (prices[buy] < prices[sell]) effectiveProfit = Math.max(effectiveProfit, prices[sell] - prices[buy]);
            else buy = sell;
            sell++;
        }

        return effectiveProfit;
    }
}
