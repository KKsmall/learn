package datastructure;

/**
 * @author liujin
 * @datetime 2019/9/29 11:20
 */
public class MyStack {

    private int[] stack;

    private int maxSize;

    private int top;

    public MyStack() {
        //表示当前栈为空
        this.top = -1;
        this.maxSize = 5;
        this.stack = new int[maxSize];
    }

    public MyStack(int size) {
        //表示当前栈为空
        this.top = -1;
        this.maxSize = size;
        this.stack = new int[size];
    }

    public void push(int value) {
        if (top < maxSize -1) {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (top != -1) {
           return stack[top--];
        }
        return -1;
    }

    public int peek() {
        if (top != -1) {
            return stack[top];
        }
        return -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize;
    }

}
