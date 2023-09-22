package org.example.Simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :刘贺君
 * &#064;description:TODO
 * @date :2023/09/20 17:38
 */
public class SumIndicesWithKSetBits {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList();
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(5);
        list.add(2);
        System.out.println(sumIndicesWithKSetBits1(list, 1));
    }
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            int x = Integer.parseInt(Integer.toBinaryString(i));
            int sum = 1;
            while (x/sum>=10)sum *=10;
            int y = 0;
            while (x>0){
                y += x % 10;
                x = x/10;
                sum /=10;
            }
            if (y==k)count +=nums.get(i);
        }
        return count;
    }

    public static int sumIndicesWithKSetBits1(List<Integer> nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k){
                count += nums.get(i);
            }
        }
        return count;
    }
}
