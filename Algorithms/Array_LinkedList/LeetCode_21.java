package Algorithms.Array_LinkedList;

/**
 * @Author : xuanyupan
 * @Time : 2018/12/16 22:49
 * @Desc : 合并两个有序链表
 */
public class LeetCode_21 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // 实际上下面利用的就是外排。
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }

        if (l2 == null){
            return l1;
        }

        ListNode result = new ListNode(0);
        ListNode resultHead = result;

        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                result.next = l1;
                result = result.next;
                l1 = l1.next;
            }else{
                result.next = l2;
                result = result.next;
                l2 = l2.next;
            }
        }
        if (l1 == null){
            result.next = l2;
        }else
            result.next = l1;

        return resultHead.next;
    }
}