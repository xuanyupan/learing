package Exercise.Algorithms.Array_LinkedList;

/**
 * @Author : xuanyupan
 * @Time : 2018/12/16 23:17
 * @Desc : k个一组进行反转
 */
public class LeetCode_25 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //先用一个计数器，来进行计数；判断当前这一组是否满足k个，满足的话将当前k个进行反转。
    //后续进行拼接部分需要考虑一下，明天补充
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode reverse = new ListNode(0);
        reverse.next = head;
        ListNode result = reverse;
        ListNode current = head;
        int count = 0;

        //改成一个方法后面
        while (reverse != null && count < k){
            reverse = reverse.next;
            k++;
        }

        if (count == k){
            while (count < k && current != null){
                //反转链表
            }
        }

        return null;
    }

}
