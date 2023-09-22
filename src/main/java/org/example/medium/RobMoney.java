package org.example.medium;

/**
 * @author :刘贺君
 * @description:打家劫舍
 * @date :2023/09/21 15:47
 */
public class RobMoney {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,2}));
    }

    //房子一定会是复数
    //如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警
    public static int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // 子问题：
        // f(k) = 偷 [0..k) 房间中的最大金额

        // f(0) = 0
        // f(1) = nums[0]
        // f(k) = max{ rob(k-1), nums[k-1] + rob(k-2) }

        int N = nums.length;
        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int k = 2; k <= N; k++) {
            dp[k] = Math.max(dp[k-1], nums[k-1] + dp[k-2]);
        }
        return dp[N];
    }
}
