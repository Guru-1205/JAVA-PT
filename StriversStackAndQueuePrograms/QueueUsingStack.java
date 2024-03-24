package Interview_Questions.StriversStackAndQueuePrograms;

import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public QueueUsingStack() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    public void add(int data) {
        s1.push(data);
    }

    public int pop() {
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        int removed = s2.pop();
        return removed;
    }

    public int peek() {
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        int top = s2.peek();
        return top;
    }

    public static void main(String s[]) {
        QueueUsingStack qs = new QueueUsingStack();
        qs.add(10);
        qs.add(20);
        qs.add(30);
        qs.add(40);
        System.out.println(qs.peek());
        System.out.println(qs.pop());
        System.out.println(qs.peek());
    }
}
