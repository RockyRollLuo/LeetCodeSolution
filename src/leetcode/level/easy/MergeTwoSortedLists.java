package leetcode.level.easy;

/***
 *Description

 Merge two sorted linked lists and return it as a new list.
 The new list should be made by splicing together the nodes of the first two lists.
 *
 * 思路

 题意是用一个新链表来合并两个已排序的链表，那我们只需要从头开始比较已排序的两个链表，新链表指针每次指向值小的节点，依次比较下去，
 最后，当其中一个链表到达了末尾，我们只需要把新链表指针指向另一个没有到末尾的链表此时的指针即可。
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {

    }

    public static ListNode mergeTwoList(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0); //初始值设定

        ListNode tail=head;

        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                tail.next=l1;
                l1=l1.next;
            }else {
                tail.next=l2;
                l2 = l2.next;
            }

            tail=tail.next;//尾指针永远指向最后
        }

        tail.next=l1!=null?l1:l2;  //补完剩余的

        return head.next;//注意头指针并不是第一个节点
    }


}


class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}