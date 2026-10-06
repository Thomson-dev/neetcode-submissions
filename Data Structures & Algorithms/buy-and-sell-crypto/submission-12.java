class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int maxProfit = 0;

        for (int right = 1; right < prices.length; right++) {

            // If we found a cheaper buying price,
            // move the left side of the window.
            if (prices[right] < prices[left]) {
                left = right;
            }

            // Current window:
            // prices[left] -> buying price
            // prices[right] -> selling price
            int profit = prices[right] - prices[left];

            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
