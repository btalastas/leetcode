import java.util.Stack;

class Solution {
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        // for (int i = 0; i < operations.length; i++) {

        // // integer
        // try {
        // int num = Integer.parseInt(operations[i]);

        // stack.push(num);
        // } catch (NumberFormatException e) {

        // // "+"

        // if (String.valueOf(operations[i]) == "+") {
        // int num1 = stack.pop();
        // int num2 = stack.pop();
        // int sum = num1 + num2;

        // stack.push(num1);
        // stack.push(num2);
        // stack.push(sum);
        // }

        // // "C"

        // if (String.valueOf(operations[i]) == "C") {
        // stack.pop();
        // }
        // // "D"

        // if (String.valueOf(operations[i]) == "D") {
        // int num = stack.peek() * 2;
        // stack.push(num);
        // }
        // }

        // }
        // int sum = 0;
        // while (!stack.empty()) {
        // sum += stack.pop();
        // }

        // return sum;

        for (String op : operations) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        int ans = 0;
        for (int score : stack)
            ans += score;
        return ans;
    }

    public static void main(String[] args) {
        String[] array = { "1", "C" };

        System.out.println(calPoints(array));
    }
}