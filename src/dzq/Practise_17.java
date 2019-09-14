package dzq;


import java.util.Stack;

/**
 * 包含min函数的栈
 */
public class Practise_17 {

    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(2);
        System.out.println(minStack.min());
        minStack.push(1);
        System.out.println(minStack.min());
        minStack.push(3);
        System.out.println(minStack.min());
        minStack.push(-1);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
    }

}

class MinStack {

    private Stack<Integer> stack = new Stack<>();

    private Stack<Integer> min = new Stack<>();

    public int pop() {
        min.pop();
        return stack.pop();
    }

    public void push(int value) {
        int minValue = 0;
        if (min.size() == 0) {
            minValue = value;
        } else {
            int i = min.peek();
            minValue = value < i ? value : i;
        }
        min.push(minValue);
        stack.push(value);
    }

    public int min() {
        return min.peek();
    }
}
