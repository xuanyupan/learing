package Exercise.Offer;

/**
 * @Date: 2019/2/4 17:57
 * @Author: xuanyupan
 * @Desc: 链表环入口
 */
public class Exercise_Offer_55 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode fast = pHead; //设置快慢节点，找到相交的点先
        ListNode slow = pHead;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){  // 如果有相交的点。
                ListNode start = pHead;
                while (slow != start){

                    slow = slow.next;
                    start = start.next;

                }
                return slow;
            }

        }
        return null;
    }
}

