public class L714BestTimetoBuyandSellStockwithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int cash = 0;
        int hold = -prices[0];
        for(int i = 1; i<n; i++){
            int oldCash = cash;
            cash = Math.max(cash, hold+prices[i]-fee);
            hold = Math.max(hold, oldCash-prices[i]);
        }
        return cash;
    }
    public static void main(String[] args) {
    }
}
