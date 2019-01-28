package Exercise.Offer;

import java.util.Stack;
import java.util.ArrayList;

/**
 * @name  剑指offer第3题
 * @author xuanyupan
 *
 */
public class Exercise_Offer_03 {
	
	public class ListNode {
		int val;
		ListNode next = null;
	
		ListNode(int val) {
			this.val = val;
		}
	}
	
	
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		
		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		while(listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		
        while(!stack.isEmpty()) {
        	arrayList.add(stack.pop());
        }
        return arrayList;
		
    }
}
