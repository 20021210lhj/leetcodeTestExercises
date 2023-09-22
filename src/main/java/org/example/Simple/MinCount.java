package org.example.Simple;

/**
 * @author :刘贺君
 * &#064;description:拿硬币minCount
 * &#064;date  :2023/09/20 10:04
 */
public class MinCount {


    public static void main(String[] args) {
        System.out.println(0/2);
        int[] a = new int[]{2,3,10};
        System.out.println(minCount(a));
    }
    public static int minCount(int[] coins) {
        int count = 0;
        for (int index : coins) count += index % 2 == 0 ? index/2:index/2+1;
        return count;
    }
}
