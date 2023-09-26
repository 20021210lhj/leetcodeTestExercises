package org.example.medium.dynamicProgramming;

/**
 * @author :刘贺君
 * &#064;description: 删除并获得点数
 * &#064;date  :2023/09/23 16:21
 */
public class DeleteAndEarn {
    public static void main(String[] args) {
        System.out.println(deleteAndEarn(new int[]{3,4,2}));
    }

    //根据提示1 <= nums[i] <= 104得知 nums[i]>1 故而可以将需要删除得元素化为0
    //假设 选择了nums[i] 那么dp[i] = dp[i-1]+nums[i]
    public static int deleteAndEarn(int[] nums) {
        int[] sum = new int[10001];
        //将旧数组得值转换成新数组得下标，新数组得值等于新数组下标在旧数组相同数的和
        //因为是将旧数组的值转成下标所以相邻的两个下标不能获取
        for (int i = 0; i <nums.length; i++) {
            sum[nums[i]] += nums[i];
        }
        //
        int[] dp = new int[10001];

        dp[0] = sum[0];
        dp[1] = Math.max(sum[0],sum[1]);
        for (int i = 2; i <sum.length; i++) {
            dp[i] = Math.max(dp[i-2]+sum[i],dp[i-1]);
        }
        return dp[sum.length-1];
    }
}
