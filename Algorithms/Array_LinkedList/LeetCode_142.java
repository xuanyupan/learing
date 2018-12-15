package Algorithms.Array_LinkedList;

/**
 * @Time : 2018/12/15 18:28
 * @Desc : 判断链表是否有环，有环的话找到入环的第一个节点。
 */
public class LeetCode_142 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //先判断圈，然后判断位置，设置head到环的起点距离为a，环起点到相遇点为b，则整体头到相遇慢的跑了a+b，但是快的整体是慢的两倍，所以
    //快的跑了头到相遇点a，两次环起点到相遇点b = 2b ,那么环的另一部分就是也是a，画一下图一目了然。所以新设置一个指针从头节点开始跑，
    //与慢节点相遇都跑了a肯定是跑到环的起点。
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean hasCycle = false;
        while (fast != null && slow != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode start = head;
                while (slow != null) { // 需要这个while判断进行另一层循环
                    if (slow == start) {
                        return slow;
                    }
                    slow = slow.next;
                    start = start.next;
                }
            }
        }
        return null;


    }
}