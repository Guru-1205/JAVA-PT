package Interview_Questions.StriversStackAndQueuePrograms;

import java.util.*;

public class RemoveKDigits {

    public static String removeKDigits(String s, int k) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            while (k > 0 && !stack.empty() && stack.peek() > c) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        // Remove remaining digits if k > 0
        while (k > 0 && !stack.empty()) {
            stack.pop();
            k--;
        }
        System.out.println(stack);

        // Construct the final result string
        StringBuilder result = new StringBuilder();
        while (!stack.empty()) {
            result.insert(0, stack.pop());
        }

        // Remove leading zeroes
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String result = removeKDigits("10032129", 3);
        System.out.println(result); // Output: 1329
    }
}
