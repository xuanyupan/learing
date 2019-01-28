package Algorithms.Array_LinkedList;

/**
 * @Author : xuanyupan
 * @Time : 2018/12/16 23:06
 * @Desc : 链表的中间结点
 */
public class LeetCode_876 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = new ListNode(0);
        fast.next = head;
        ListNode slow = fast;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.next;
    }
}
