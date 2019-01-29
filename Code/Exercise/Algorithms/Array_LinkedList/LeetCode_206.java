package Exercise.Algorithms.Array_LinkedList;

/**
 * @Author : xuanyupan
 * @Time : 2018/12/15 16:16
 * @Desc : 反转整个链表
 */
public class LeetCode_206 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode next = current.next; //必须要有这个存到一个临时变量里面，否则第17行如果指向下一个的时候会直接因为15行指的是原来的前节点。
            current.next = prev;
            prev = current;
            current = next; //把刚才存的下一个节点就是原来链表的下一个节点，给到当前，进行下一次循环。 这个互换类似冒泡交换两个数的操作
        }
        return prev;
    }


}
