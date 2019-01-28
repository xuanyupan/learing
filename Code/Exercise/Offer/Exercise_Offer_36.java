package Exercise.Offer;

/**
 * @Date: 2019/1/18 15:33
 * @Author: xuanyupan
 * @Desc: 找到两个链表第一个相同节点
 */
public class Exercise_Offer_36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        int list_1 = 0, list_2 = 0, k;
        ListNode current1 = pHead1;
        ListNode current2 = pHead2;
        // 求出两个链表的长度
        while (current1.next != null) {
            current1 = current1.next;
            list_1++;
        }

        while (current2.next != null) {
            current2 = current2.next;
            list_2++;
        }

        // 根据两个链表
        k = list_1 - list_2;
        if (k > 0) {
            while (k > 0) {
                pHead1 = pHead1.next;
                k--;
            }

        } else {
            while (k < 0) {
                pHead2 = pHead2.next;
                k++;
            }
        }

       while (pHead1.next != null){
           if (pHead1 == pHead2)
               return pHead1;
           pHead1 = pHead1.next;
           pHead2 = pHead2.next;
       }
       return null;
    }
}
