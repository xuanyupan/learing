package offer.exercise_2018_11;

/**
 * @name 剑指offer第14题
 * @author xuanyupan
 * 
 */
public class Exercise_Offer_14 {
	
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	
    public ListNode FindKthToTail(ListNode head,int k) {
    	ListNode listNode = head;
    	ListNode result = head;
    	if(head == null || k<=0) {
    		return null;
    	}
    	for (int i = 1;i<k;i++) {
    		if(listNode.next != null) {
    			listNode = listNode.next;
    		}else
    			return null;
    	}
    	
    	while (listNode.next != null) {
    		listNode =listNode.next;
    		result = result.next;
    	}
    	
    	return result;
    }
}
