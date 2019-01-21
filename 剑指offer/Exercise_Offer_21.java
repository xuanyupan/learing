package offer.exercise_2018_11;

import java.util.Stack;

/**
 * @name 剑指offer第22题 判断栈的出栈顺序是否符合
 * @author xuanyupan
 *
 */
public class Exercise_Offer_21 {
	  public boolean IsPopOrder(int [] pushA,int [] popA) {
	      
		  if (pushA == null || popA == null) {
	    	  return false;
	      }
	      
	      Stack<Integer> s = new Stack<Integer>();
	      int index = 0; 
	      
	      for (int i = 0;i< pushA.length; i++) {
	    	  s.push(pushA[i]);
	    	  while (!s.empty() && s.peek() == popA[index]) {
	    		  index ++ ;
	    		  s.pop();
	    	  }
	      }
	      return s.empty();
	  }
}
