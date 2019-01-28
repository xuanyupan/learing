package Algorithms.Array_LinkedList;

/**
 * @Author : xuanyupan
 * @Time : 2018/12/16 22:37
 * @Desc : 删除倒数第n个节点
 */
public class LeetCode_19 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //两个指针，一个先走n步，一个后走。
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode fast = result;
        ListNode slow = result;

        while (n > 0) {
            fast = fast.next;
            n--;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return result.next;
    }

}
