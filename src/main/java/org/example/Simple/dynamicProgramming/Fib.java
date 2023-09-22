package org.example.Simple.dynamicProgramming;

/**
 * @author :刘贺君
 * &#064;description:斐波那契数
 * &#064;date  :2023/09/22 16:50
 */
public class Fib {

    public static void main(String[] args) {

    }
    //题目提示  n = f(n-1)+f(n-2)
    //循环次数根据题目分析 n值是前两次值的总和，故值也应该从n=2为最低值开始循环，所以假设n==2 那么循环次数为i<n-1||i<=n-2
    //否则返回
    public int fib(int n) {
        if (n==0)return 0;
        int a = 0,b = 1;
        int sum ;
        for (int i = 0; i <n-1; i++) {
            sum = a+b;
            a = b;
            b = sum;
        }
        return b;
    }
}
