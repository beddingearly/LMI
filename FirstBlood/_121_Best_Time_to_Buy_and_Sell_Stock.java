/**
 * @Title: _121_Best_Time_to_Buy_and_Sell_Stock
 * @ProjectName LMI
 * @Auther: beddingearly
 * @Date: 2018-12-27 22:12
 * @Description:
 */
public class _121_Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int maxn = 0;
        int minn = 100000;
        int dest = 0;
        for(int i = 0; i < prices.length; i++){
            minn = minn < prices[i]? minn: prices[i];
            maxn = prices[i];
            dest = maxn-minn > dest? maxn-minn: dest;
        }
        return dest;
    }
}
