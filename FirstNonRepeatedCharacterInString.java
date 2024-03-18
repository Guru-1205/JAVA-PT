package Interview_Questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacterInString {
    public static char M1(String s) {
        int arr[] = new int[26];
        int index[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] += 1;
            index[s.charAt(i) - 'a'] = i;
        }
        int minIndex = Integer.MAX_VALUE;
        char res = '\u0000';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 && minIndex > index[i]) {
                res = (char) (i + 97);
                minIndex = index[i];
            }
        }
        return res;
    }

    public static char M2(String s) {
        Map<Character, Integer> hmp = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            hmp.put(s.charAt(i), hmp.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : hmp.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return '\u0000';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find the first non-repeated character :");
        String s = sc.next();
        System.out.printf("The first non-repeated character : %c", M2(s));
        sc.close();
    }
}
