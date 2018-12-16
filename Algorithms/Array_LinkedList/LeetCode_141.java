package Algorithms.Array_LinkedList;

/**
 * @Author : xuanyupan
 * @Time : 2018/12/15 18:07
 * @Desc : 判断一个链表是否有环
 */
public class LeetCode_141 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    //设置快慢指针，如果有环，快的会与慢的相遇。
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && slow!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
}
