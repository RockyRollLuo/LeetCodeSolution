package leetcode.level.medium;

/***
 *Description
 You are given two non-empty linked lists representing two non-negative integers.
 The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example
 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 Explanation: 342 + 465 = 807.
 *
 * 思路
 就是以链表表示一个数，低位在前，高位在后，所以题中的例子就是 342 + 465 = 807，所以我们模拟计算即可。
 */
public class AddTwoNumbers {

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode n1 = l1, n2 = l2, temp = node;
        int sum=0;
        while (n1 != null || n2 != null) {
            sum /= 10;  //进位

            if (n1 != null) {
                sum += n1.val;
                n1 = n1.next;
            }
            if (n2 != null) {
                sum += n2.val;
                n2 = n2.next;
            }

            temp.next = new ListNode(sum % 10);
            temp=temp.next;
        }
        //while循环结束后，若最高位还有进位。只可能进1了
        if (sum / 10 != 0) {
            temp.next = new ListNode(1);
        }
        return node.next;
    }


}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}