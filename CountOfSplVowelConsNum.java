package Interview_Questions;

import java.util.*;

public class CountOfSplVowelConsNum {
    public static void M1(String s) {
        String c = null;
        int v = 0, n = 0, sp = 0, con = 0;
        for (int i = 0; i < s.length(); i++) {
            c = Character.toString(s.charAt(i));
            if (c.matches("[aeiou]"))
                v += 1;
            else if (c.matches("[0-9]"))
                n += 1;
            else if (c.matches("[!@#$%^&*]"))
                sp += 1;
            else
                con += 1;
        }
        System.out.printf("The total number of numeric characters in the string : %d\n", n);
        System.out.printf("The total number of special characters in the string : %d\n", sp);
        System.out.printf("The total number of vowels in the string : %d\n", v);
        System.out.printf("The total number of consonants letters in the string : %d\n", con);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter a string to count the number of special characters ,vowels ,consonants and numeric characters :");
        String s = sc.nextLine();
        M1(s);
        sc.close();
    }
}
