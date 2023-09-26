package org.example.Simple.dynamicProgramming;

/**
 * @author :刘贺君
 * &#064;description:使用最小花费爬楼梯
 * @date :2023/09/22 17:38
 */
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{5,1,10,15}));
    }

    // 根据题意cost 长度为n,则n-1等于最后一个台阶,楼层顶部等于n，问题等价于求到达n的最便宜的花费
    // 那么我们创建一个dp[n+1]就可以得到一个包含n层的数组容量，其中dp[n]==到达n的最小花费
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        //由于可以选择从0开始或者从1开始 故而到达0和1都不需要花费
        dp[0] = dp[1] = 0;
        //当2<= i <=n时,从2开始才收费
        for (int i = 2; i <=n; i++) {
            //从前i-1或者i-2跳到i的位置需要加上i-1或者i-2的成本
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[n];
    }
}
