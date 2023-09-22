package org.example.Simple;

/**
 * @author :刘贺君
 * @description:买卖股票的最佳时机
 * @date :2023/09/11 10:34
 */
public class MaxProfit {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] prices) {
        //最大价格天
        int max = 0;
        //最小价格天
        int min = 0;
        //收益最大
        int sum = 0;
//        for (int index = 0;index<prices.length;index++){
//            if (prices[min]>prices[index] && index+1 != prices.length) min = index;
//            if (prices[max]<prices[index]) max = index;
//            if (min>max) max = min;
//            sum = Math.max(sum, prices[max] - prices[min]);
//        }
        //min 绝对要小于max
        //如果max的价格比min的还要低那么就应该赋值给min
        while (max < prices.length){
            if (prices[min]<prices[max]){
                sum = Math.max(sum, prices[max] - prices[min]);
            }else {
                min = max;
            }
            max++;
        }


        return sum;
    }
}
