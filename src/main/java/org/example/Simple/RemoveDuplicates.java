package org.example.Simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :刘贺君
 * @description:删除有序数组中的重复项
 * @date :2023/09/10 12:51
 */
public class RemoveDuplicates {


    public static void main(String[] args) {
        int [] x = new int[]{2,2,2,2,2,2,4,4,5,5,8,9,9};
        int i1 = removeDuplicates(x);
        for (int i = 0; i < i1; i++) {
            System.out.println(x[i]);
        }
    }
    public static int removeDuplicates(int[] nums) {
//        int k = 0;
//        for (int x = 0;x < nums.length;x++){
//            nums[nums[x]] = nums[x];
//            if (k<nums[x])k = nums[x];
//        }
//        return k+1;
        //排序k指针，用来找到最大值
        int y = 0;//y指针所指向的数组元素就是这个数组的最大值
        for (int x=0,k=0;x < nums.length;x++){
            if (nums[k]<nums[x]){nums[++y] = nums[x];k = x;}
        }

        return y+1;
    }
}
