package Exercise.Offer;

/**
 * @name  剑指offer第16题
 * @author xuanyupan
 * 
 */
public class Exercise_Offer_16 {

	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode Merge(ListNode list1, ListNode list2) {
		ListNode listNode = null;
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}

		if (list1.val < list2.val) {
			listNode = list1;
			listNode.next = Merge(list1.next, list2);
		} else {
			listNode = list2;
			listNode.next = Merge(list1, list2.next);
		}
		return listNode;
	}
}
