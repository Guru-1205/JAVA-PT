package Interview_Questions;

import java.util.*;

public class WellFormedString {
    public static boolean M1(String s) {
        Stack<Character> st = new Stack<Character>();
        char c = '\0';
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(')
                st.push(c);
            else {
                if (st.peek() == '{' && c != '}')
                    return false;
                else if (st.peek() == '(' && c != ')')
                    return false;
                else if (st.peek() == '[' && c != ']')
                    return false;
                else
                    st.pop();
            }
        }
        if (st.empty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check whether it is balanced or not :");
        String s = sc.nextLine();
        if (M1(s))
            System.out.println("Balanced String ...!!!");
        else
            System.out.println("Not a balanced String...");
        sc.close();
    }
}
