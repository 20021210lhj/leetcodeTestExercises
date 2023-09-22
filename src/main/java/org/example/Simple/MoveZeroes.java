package org.example.Simple;

import java.util.Arrays;

/**
 * @author :刘贺君
 * &#064;description:移动零
 * &#064;date  :2023/09/20 11:11
 */
public class MoveZeroes {

    public static void main(String[] args) {

        moveZeroes(new int[]{1,0,0,3,12});
    }


    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int index = 0;index <nums.length;index++){
           if (nums[count] != 0)++count;
           if (nums[index] != 0 && index>count){
               nums[count] = nums[index];
               nums[index] = 0;
           }
        }
    }

}
