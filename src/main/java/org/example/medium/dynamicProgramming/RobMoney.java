package org.example.medium.dynamicProgramming;

/**
 * @author :刘贺君
 * @description:打家劫舍
 * @date :2023/09/21 15:47
 */
/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，
 * 影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 */
public class RobMoney {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,1,1,2}));
    }

    //有n间房,如果偷第n间房就不能偷n-1号房
    //设立子问题：偷k间房偷了多少钱，0<=k<n
    //初始值设0和1 因为你有两种选择 要么从0开始偷 要么从1开始偷
    //偷到k间房的时候所偷金额是(k-2)+k
    //不偷k间房的时候所偷金额偷窃为总金额为前k−1的最大金额
    public static int rob(int[] nums) {
        if (nums.length ==1 ) return nums[0];

        int n = nums.length;
        //设立dp数组,
        int [] dp = new int[n+1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1],nums[0]);

        for (int k = 2; k <n; k++) {
            dp[k] = Math.max(dp[k-2]+nums[k],dp[k-1]);
        }

        return dp[n-1];
    }
}
