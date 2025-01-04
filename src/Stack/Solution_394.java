package Stack;

import java.util.Stack;

public class Solution_394 {
    //stack
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        int i = 0;
        int length = s.length();

        while (i < length) {

            if (s.charAt(i) != ']') {
                stack.push(s.charAt(i));
            } else {
                //decode
                StringBuilder sb = new StringBuilder();
                StringBuilder num = new StringBuilder();
                while (!stack.empty() && stack.peek() != '[') {
                    sb.append(stack.pop());
                }

                sb.reverse();
                if (!stack.empty() && stack.peek() == '[') {
                    stack.pop();
                }

                while (!stack.empty() && stack.peek() >= '0' && stack.peek() <= '9') {
                    num.append(stack.pop());
                }
                num.reverse();
                int loop = num.isEmpty() ? 1 : Integer.parseInt(num.toString());

                if (stack.empty()) {
                    while (loop > 0) {
                        res.append(sb);
                        loop--;
                    }
                } else {
                    while (loop > 0) {
                        for (int k = 0; k < sb.length(); k++) {
                            stack.push(sb.charAt(k));
                        }
                        loop--;
                    }
                }
            }
            i++;
        }

        StringBuilder temp = new StringBuilder();

        while (!stack.empty()) {
            temp.append(stack.pop());
        }
        res.append(temp.reverse());

        return res.toString();
    }
}
