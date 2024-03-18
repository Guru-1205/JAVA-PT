package Interview_Questions;

import java.util.*;

public class StringCompression {
    public static void M1(String s) {
        Map<Character, Integer> hmp = new LinkedHashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            hmp.put(c, hmp.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : hmp.entrySet()) {
            System.out.print(entry.getKey());
            System.out.print(entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string for compression :");
        String s = sc.nextLine();
        M1(s);
        sc.close();
    }
}
