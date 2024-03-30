package Interview_Questions.StriversStackAndQueuePrograms;

import java.util.*;

public class AsteroidCollision {

    public static void M1(int arr[]) {
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (st.empty() && arr[i] < 0) {
                continue;
            } else if (arr[i] > 0) {
                st.push(arr[i]);
            } else if (st.peek() == Math.abs(arr[i])) {
                st.pop();
            } else {
                while (!st.empty() && st.peek() > 0 && st.peek() < Math.abs(arr[i])) {
                    st.pop();
                }
                if (st.empty())
                    st.push(arr[i]);
            }
        }
        System.out.println(st);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, -12, -4 };
        M1(arr);
    }
}
