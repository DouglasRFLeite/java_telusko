package structures;

public class Stack {
    int nums[] = new int[5];
    int top = -1;

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(2);

        s.show();

        s.push(6);
        s.push(9);

        s.show();

        s.pop();

        s.show();
    }

    public void show() {
        for (int i = nums.length - 1; i >= 0; i--) {
            String isTop = i == top ? " <- top" : "";
            System.out.println(nums[i] + isTop);
        }
        System.out.println();
    }

    public void push(int data) {
        if (top < 4) {
            top++;
            nums[top] = data;
            return;
        }
        System.out.println("Overflow");
    }

    public int pop() {
        if (top >= 0) {

            int topEl = nums[top];
            nums[top] = 0;
            top--;
            return topEl;
        }
        System.out.println("Underflow");
        return -1;
    }

}
