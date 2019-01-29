package Exercise.Algorithms.TanXin;

import java.util.Stack;

/**
 * @Author : xuanyupan
 * @Time : 2018/12/18 21:25
 * @Desc : 一个长为l的字符串，去掉任意k位，使的剩下的字符串最小，怎么更小，高位值越小对应整体值也就越小
 */
public class LeetCode_402 {
    public static String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<Integer>();
        if (num.length() == k){
            return "0";
        }
        for (int i = 0; i < num.length(); i++) {
            int current = num.charAt(i) - '0';
            while (!stack.isEmpty() && stack.peek() > current && k > 0) {
                stack.pop();
                k--;
            }
            if (!(stack.isEmpty() && current == 0)) {
                stack.push(current);
            }
        }
        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder = stringBuilder.append(stack.pop());
        }
        stringBuilder.reverse();
        if (stringBuilder.toString().equals("")) {
            return "0";
        }
        return stringBuilder.toString();

    }


    public static void main (String args[]){
        System.out.println(removeKdigits("123",2));
    }
}
