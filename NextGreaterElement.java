package Interview_Questions;

import java.util.*;

public class NextGreaterElement {
    public static void M1(int arr[]) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            while (!st.empty() && st.peek() < arr[i]) {
                System.out.println(st.peek() + "->" + arr[i]);
                st.pop();
            }
            st.push(arr[i]);
        }
        while (!st.empty()) {
            System.out.println(st.peek() + "-> -1");
            st.pop();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };
        M1(arr);
        sc.close();
    }
}
