package org.example.algorithms;

import java.util.Arrays;

/**
 * @author :刘贺君
 * @description:合并两个有序数组
 * @date :2023/09/04 16:19
 */
public class TwoSumArrags
{


    public static void main(String[] args) {
        int[] ints = {2,0};
        int[] ints2 = {1};
        merge(ints,1,ints2,1);

        System.out.println(Arrays.toString(ints));
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0){
            return;
        }
        int p1 = Math.max(m - 1, 0), p2 = Math.max(n - 1, 0);
        int tail = m + n - 1;
        int cur;
        while (p2 >=0){
            if (!(p1 == -1) && nums1[p1]>nums2[p2])
                cur = nums1[p1--];else
                cur = nums2[p2--];nums1[tail--] = cur;
        }
    }

}
