package Interview_Questions.StriversStackAndQueuePrograms;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsingQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int data) {
        q1.add(data);
    }

    public int peek() {
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int top = q1.peek();
        q2.add(q1.remove());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }

    public int pop() {
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int pop = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return pop;
    }

    public static void main(String[] args) {
        StackUsingQueue sq = new StackUsingQueue();
        sq.push(10);
        sq.push(20);
        sq.push(30);
        sq.push(40);
        System.out.println(sq.peek()); // Output: 40
        System.out.println(sq.pop()); // Output: 40
        System.out.println(sq.peek()); // Output: 30
    }
}
