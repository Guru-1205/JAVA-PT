package Interview_Questions.StriversStringPrograms.Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoAnagrams {
    public static boolean M1(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> hmp = new HashMap<Character, Integer>();
        for (char i : s.toCharArray()) {
            hmp.put(i, hmp.getOrDefault(i, 0) + 1);
        }
        for (char i : t.toCharArray()) {
            hmp.put(i, hmp.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : hmp.entrySet()) {
            if (entry.getValue() % 2 != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if (M1("add", "dad")) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not anagrams");
        }
    }
}
