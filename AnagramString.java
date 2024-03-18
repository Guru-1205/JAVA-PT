package Interview_Questions;

import java.util.*;

public class AnagramString {

    public static boolean M1(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i])
                return false;
        }
        return true;
    }

    public static boolean M2(String s1, String s2) {
        HashMap<Character, Integer> hmp = new HashMap<Character, Integer>();
        for (int i = 0; i < s1.length(); i++) {
            hmp.put(s1.charAt(i), hmp.getOrDefault(s1.charAt(i), 0) + 1);
        }
        // System.out.println(hmp);
        for (int i = 0; i < s2.length(); i++) {
            hmp.put(s2.charAt(i), hmp.getOrDefault(s2.charAt(i), 0) - 1);
        }
        // System.out.println(hmp);
        for (int i : hmp.values()) {
            if (i != 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings to check whether they are anagrams or not :");
        String s1 = sc.next();
        String s2 = sc.next();
        if (M2(s1, s2))
            System.out.println("Yes,The given strings are anagrams...!!!");
        else
            System.out.println("Nope, not an anagram");
        sc.close();

    }
}
