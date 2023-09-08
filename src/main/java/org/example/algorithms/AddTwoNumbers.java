package org.example.algorithms;

import java.math.BigInteger;

/**
 * @author :刘贺君
 * @description:两数相加
 * @date :2023/09/07 15:47
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(9);
        ListNode listNode2 = new ListNode(1,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))))))));
        ListNode listNode1 = addTwoNumbers(listNode, listNode2);


        System.out.println(listNode1);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return aVoid(l1,l2,0);
    }

    public static ListNode aVoid(ListNode l1, ListNode l2, int a){
            if (l1 ==null && l2 == null) return a % 10 == 0 ? null : new ListNode(a % 10);
        if (l1 != null){a+= l1.val;l1 = l1.next;}
        if (l2 != null){a+= l2.val;l2 = l2.next;}
        return new ListNode(a % 10,aVoid(l1,l2,a / 10));
    }

}
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}