package Interview_Questions.StriversStringPrograms.Medium;

import java.util.*;

public class LongestSubStringWithoutRepetition {

    public static void M1(String s) {
        int j = 0, result = 1;
        HashSet<Character> hs = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (hs.contains(s.charAt(i))) {
                while (j < i && hs.contains(s.charAt(i))) {
                    hs.remove(s.charAt(j));
                    j++;
                }
            }
            hs.add(s.charAt(i));
            result = Math.max(result, i - j + 1);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        M1("abcaefcbb");
    }
}
