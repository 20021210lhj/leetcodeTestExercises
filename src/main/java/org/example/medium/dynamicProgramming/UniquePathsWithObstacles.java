package org.example.medium.dynamicProgramming;

/**
 * @author :刘贺君
 * @description:不同路径 II
 * @date :2023/09/26 9:35
 */
public class UniquePathsWithObstacles {
    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0,0,0}, {0,1,0},{0,0,0}}));
    }

    //递推公式等于：dp[i][j] = dp[i-1][j]+dp[i][j-1]
    //且下标从1开始，遇到障碍物不加1;
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        dp[0][0] = obstacleGrid[0][0] == 0 ? 1:0;
        //初始化第一列
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) break;
            dp[i][0] = 1;
        }
        //初始化第一行
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i] == 1) break;
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
