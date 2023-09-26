package org.example.medium.dynamicProgramming;

/**
 * @author :刘贺君
 * @description:不同路径
 * @date :2023/09/25 16:07
 */
public class UniquePaths {

    public static void main(String[] args) {
        uniquePaths(3,3);
    }

    //从出发得选择来看只有两种情况 一种是m-1 一种是n-1
    //每走一步都会得到一个新坐标 m+n且最终目的为0
    //
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) dp[0][i] = 1;
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
