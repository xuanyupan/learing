package Exercise.Algorithms.Array_LinkedList;

/**
 * @Author : xuanyupan
 * @Time : 2018/12/19 20:44
 * @Desc : 再写一遍反转链表
 */
public class LeetCode_206_Again {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode new_head = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = new_head;
            new_head = head;
            head = temp;
        }
        return new_head;
    }
}