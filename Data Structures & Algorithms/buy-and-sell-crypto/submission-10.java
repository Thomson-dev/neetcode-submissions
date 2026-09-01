class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxPrice = 0;

        for(int price : prices){
            if (price < minPrice){
                minPrice = price;
            }
            int profit = price - minPrice;

            maxPrice = Math.max(profit, maxPrice);
        }
        return maxPrice;
        
    }
}
