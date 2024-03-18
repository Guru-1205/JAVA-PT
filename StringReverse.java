package Interview_Questions;

import java.util.Scanner;

public class StringReverse {
    public static void M1(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i != -1; i--) {
            sb.append(s.charAt(i));
        }
        System.out.printf("The reversed string : %s", sb.toString());
    }

    public static String M2(String s) {
        if (s == null || s.length() <= 1)
            return s;
        return M2(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to print in reverse :");
        String s = sc.nextLine();
        // M1(s);
        System.out.printf("After reversing the string : %s", M2(s));
        sc.close();

    }
}
