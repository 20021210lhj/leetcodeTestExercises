package org.example.Simple;

import com.sun.javafx.image.impl.IntArgb;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author :刘贺君
 * @description:有效的括号
 * @date :2023/09/08 14:03
 */
public class IsValid {
    public static void main(String[] args) {
        boolean valid = isValid("){");
        System.out.println(valid);
    }

    /**
     *
     class Solution {
     public static boolean isValid(String s) {
     //如果等于1说明是奇书可直接返回false
     if (s.length() % 2 == 1)return false;
     //字符数组
     char[] charArray = s.toCharArray();
     //栈
     Deque<Integer> deque = new ArrayDeque();

     int index = 0;
     while (index < charArray.length)
     {
     //利用ASCII码表来判断
     int x = charArray[index];
     //利用栈先进后出的特性，如果检测到左侧则直接压入栈中
     if (x == 40 || x == 91 || x==123)
     {
     deque.push(x);
     //如果当前字符不为左侧且栈内有元素
     }else{
     if (deque.isEmpty())return false;
     //先进后出，弹出刚存入栈内的元素进行判断
     switch (deque.pop()){
     //因为栈内元素都是左侧括号，在根据题目提示：每个右括号都有一个对应的相同类型的左括号，
     //所以如果当前字符x是右侧的时候，x必须得和charArray[index-1]位字符是同一类型的括号
     //并且达成闭合

     //判断charArray[index-1]是哪种类型的左侧括号
     case 40:
     //如果是(那么就强制性要求x必须是)否则返回false
     if (x!=41)return false;
     break;
     case 91:
     if (x!=93)return false;
     break;
     case 123:
     if (x!=125)return false;
     break;
     default:
     return false;
     }
     }
     index++;
     }
     //可以传入的s字符串看成消消乐 如果全部对称的都消除了那么就返回true，如果还遗留了比如说[]{}(
     //一个(就返回false
     return deque.isEmpty();

     }



     }
     */
    //有效的括号
    public static boolean isValid(String s) {
        if (s.length() % 2 == 1)return false;
        Deque<Character> deque = new ArrayDeque();
        for (char x : s.toCharArray())
        {
            if (x == '(' || x == '[' || x== '{') {deque.push(x);}
            else {
                if (deque.isEmpty())return false;
                switch (deque.pop()){
                        case '(': if (x!=')')return false;break;
                        case '[': if (x!=']')return false;break;
                        case '{': if (x!='}')return false;break;
                        default: return false;
                }
            }
        }
        return deque.isEmpty();
    }

}
