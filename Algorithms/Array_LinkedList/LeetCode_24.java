package Algorithms.Array_LinkedList;

/**
 * @Author : xuanyupan
 * @Time : 2018/12/15 16:53
 * @Desc : 链表两两节点交换
 */
public class LeetCode_24 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return head;
        ListNode preHead = new ListNode(-1);  //先设置一个在头结点之前的节点，然后把头结点给他，这样子下面判断后一个与后两个就是前两个元素，如果直接判断头结点的下一个与下两个，就需要达到至少三个元素。
        preHead.next = head;
        head = preHead;

        while (head.next != null && head.next.next != null) {
            ListNode temp_1 = head.next;
            ListNode temp_2 = head.next.next;

            head.next = temp_2;  //将那个虚的头结点指向第二个，先将第一个指向后面一组的开始，就是对应第三个，然后再将第二个（现在的头结点）指向第一个，完成一组的反转和指向下一组
            temp_1.next = temp_2.next;
            temp_2.next = temp_1;
            head = temp_1; //然后把下一组给到，实际上就是两两一组结合，反转，再链接起来下一组

        }
        return preHead.next; //注意返回的时候返回虚头节点的下一个开始，就是真正的链表
    }
}
