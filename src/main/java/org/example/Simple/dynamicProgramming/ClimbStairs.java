package org.example.Simple.dynamicProgramming;

/**
 * @author :刘贺君
 * &#064;description:动态规划第一题：爬楼梯
 * @date :2023/09/22 14:15
 */
public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }


    public static int climbStairs(int n) {
        int a = 1, b = 1, sum;
        for(int i = 0; i <=n - 2; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;

    }
}
