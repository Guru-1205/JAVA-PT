package Interview_Questions;

import java.util.Scanner;

public class PalindromeString {
    public static boolean M1(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean M2(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if (s.equals(sb.toString()))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check whether it is a palindrome :");
        String s = sc.nextLine();
        if (M2(s))
            System.out.println("Yes, the given string is a palindrome...!!!");
        else
            System.out.println("Nope, not a palindrome...!!!");
        sc.close();

    }
}
