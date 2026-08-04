class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxRight = 0;
        int ans = 0;
        for(int i=n-1;i>=0;i--){
            maxRight = Math.max(maxRight,prices[i]);
            ans = Math.max(ans, maxRight - prices[i]);
        }
        return ans;
    }
}
