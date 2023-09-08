package org.example.Simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author :刘贺君
 * @description:两数之和
 * @date :2023/09/04 10:35
 */
public class TwoNumbers
{
    public static void main(String[] args) {
        Map<Integer,Integer> nums  = new HashMap<Integer,Integer>();
        for (int i = 1; i <=500; i++) {
            nums.put(i,i);
        }
        System.out.println("下标相加："+ Arrays.toString(get(nums, 18)));
    }

    /**
     * create by: 刘贺君
     * description: 两数之和
     * create time: 2023/9/4 10:40
     *
      * @param nums
     * @param target
     * @return
     */
    public static int[] get(Map<Integer, Integer> nums, int target){
        Map<Integer,Integer> table = new HashMap<>();
        for (int i = 1; i < nums.size(); i++) {
            if (table.containsKey(target- nums.get(i))){
                System.out.println("nums:"+nums);
                System.out.println("table:"+table);
                return new int[]{target - nums.get(i)-1, i-1};
            }
                table.put(nums.get(i),nums.get(i));
        }
        return new int[]{0};
    }
}
