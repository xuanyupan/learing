package offer.exercise_2018_11;

import java.util.Stack;

/**
 * @name  剑指offer第5题
 * @author xuanyupan
 * 
 */
public class Exercise_Offer_05 {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		stack2.push(node);
	}

	public int pop() {
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		return stack1.pop();

	}
}
