package org.example.Simple;

/**
 * @author :刘贺君
 * @description:回文数
 * @date :2023/09/12 14:38
 */
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
    //将最低位和最高位 对比是否一致，并依次类推直到最终间元素
    public static boolean isPalindrome(int x) {
        if (x<0)return false;

        int cur = 1;
        while (x/cur >= 10) cur *=10;
        while (x>0)
        {
            int lif = x/cur;
            int rig = x % 10;
            if (lif != rig) return false;
            x = (x % cur) / 10;
            cur /=100;

        }

        return true;
    }
}
