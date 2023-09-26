package org.example.medium.dynamicProgramming;

/**
 * @author :刘贺君
 * @description:最小路径和
 * @date :2023/09/25 17:08
 */
public class MinPathSum {
    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{{1,3,1}, {1,5,1},{4,2,1}}));
    }
    //当前位置的花费是上一坐标的总花费+当前坐标花费
    //且每个点都是上点和左边的取最小的与当前相加
    //利用dp 先定义子问题，并将子问题的最优解答案压入dp数组中
    //递推公式 dp[i][j] = Math.min(dp[i-1][j]+grid[i][j],dp[i][j-1]+grid[i][j])
    public static int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) dp[i][0] =dp[i-1][0]+grid[i][0];
        for (int j = 1; j <grid[0].length; j++) dp[0][j] =dp[0][j-1]+ grid[0][j];

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j <grid[i].length; j++) {
               dp[i][j] = Math.min(dp[i-1][j]+grid[i][j],dp[i][j-1]+grid[i][j]);
            }
        }
        return dp[grid.length-1][grid[grid.length-1].length-1];
    }
}
