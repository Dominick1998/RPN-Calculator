import java.io.*;
import java.util.*;

class Solution {
    public int stacky(String[] tokens) {
        Stack<String> stack = new Stack<String>();
        int x, y;
        String result = "";
        int get = 0;
        String choice;
        int value = 0;
        String p = "";

        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") &&
                !tokens[i].equals("*") && !tokens[i].equals("/")) {
                stack.push(tokens[i]);
                continue;
            } else {
                choice = tokens[i];
            }

            switch (choice) {
                case "+":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x + y;
                    result = p + value;
                    stack.push(result);
                    break;
                case "-":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = y - x;
                    result = p + value;
                    stack.push(result);
                    break;
                case "*":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x * y;
                    result = p + value;
                    stack.push(result);
                    break;
                case "/":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = y / x;
                    result = p + value;
                    stack.push(result);
                    break;
                default:
                    continue;
            }
        }
        return Integer.parseInt(stack.pop());
    }
}

class Main {
    public static void main(String[] args) {
        String[] s = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        Solution str = new Solution();
        int result = str.stacky(s);
        System.out.println(result);
    }
}
