package Interview_Questions.StriversStackAndQueuePrograms;

import java.util.*;

public class NextSmallerElement {
    public static void M1(int arr[]) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            while (!st.empty() && st.peek() > arr[i]) {
                System.out.print(st.peek() + " -> " + arr[i] + " ");
                st.pop();
            }
            st.push(arr[i]);

        }
        while (!st.empty()) {
            System.out.print(st.peek() + " -> -1 ");
            st.pop();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 35, 25, 5, 1 };
        M1(arr);

    }
}
