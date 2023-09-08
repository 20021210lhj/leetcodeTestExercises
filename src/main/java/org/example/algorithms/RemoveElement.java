package org.example.algorithms;

import java.util.Arrays;

/**
 * @author :刘贺君
 * @description:移除元素
 * @date :2023/09/06 15:34
 */
public class RemoveElement
{
    //等于val的替换成0,并且放到数组最后位
    public static void main(String[] args) {
        int[] abc = new int[]{2,2,2};
        int val = 2;

        System.out.println(removeElement(abc,val));
        System.out.println(Arrays.toString(abc));
    }
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        //从头开始指针
        int length = 0;
        //从尾开始的指针
        int sum = nums.length;
        //为了保证有效值都在前面，所以尾针没有碰到要清理的值就不动，头针便利即可
        while (length < sum ){
            if (nums[length] == val)
            {
                nums[length] = nums[sum-1];
                sum--;
            }else  length++;

        }
        return sum;
    }
}
