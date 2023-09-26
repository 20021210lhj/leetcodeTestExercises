package org.example.Simple.dynamicProgramming;

/**
 * @author :刘贺君
 * &#064;description:第 N 个泰波那契数
 * @date :2023/09/22 17:09
 */
public class Tribonacci {

    public static void main(String[] args) {

    }

    //已知泰波那契数的第n位是由f(n-1)f(n-2)f(n-3)组成
    //且已知T0 = 0, T1 = 1, T2 = 1
    public static int tribonacci(int n) {
        int a = 0,b = 1,c = 1;
        int sum ;
        if (n == 0)return 0;
        for (int i = 0; i <n-2; i++) {
            sum = a+b+c;
            a = b;
            b = c;
            c = sum;
        }
        return c;
    }
}
