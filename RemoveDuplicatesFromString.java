package Interview_Questions;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromString {
    public static String M1(String s) {
        HashSet<Character> hs = new HashSet<Character>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!(hs.contains(s.charAt(i)))) {
                hs.add(s.charAt(i));
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to print without duplicates :");
        String s = sc.next();
        System.out.printf("The string without duplicates :%s", M1(s));
        sc.close();
    }
}
