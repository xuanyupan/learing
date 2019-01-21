package offer.exercise_2018_11;

/**
 * @name  剑指offer第15题
 * @author xuanyupan
 * 
 */
public class Exercise_Offer_15 {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode ReverseList(ListNode head) {
		ListNode pre = null; 
		ListNode next = null; 
		if (head == null) {
			return null;
		}

		while (head != null) {
			next = head.next; 
			head.next = pre; 
			pre = head; 
			head = head.next; 

		}
		return pre;
	}

}
