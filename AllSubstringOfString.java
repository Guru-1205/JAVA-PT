package Interview_Questions;

import java.util.*;

public class AllSubstringOfString {
    public static void M1(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                System.out.println(s.substring(i, j + 1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to print all the substring :");
        String s = sc.nextLine();
        M1(s);
        sc.close();
    }
}
