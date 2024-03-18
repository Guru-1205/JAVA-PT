package Interview_Questions;

import java.util.*;

public class Panagram {
    public static boolean M1(String s) {
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                continue;
            arr[s.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check for anagram or not :");
        String s = sc.nextLine();
        if (M1(s))
            System.out.print("The given string is a panagram...!!!");
        else
            System.out.println("Nope, not an anagram");
        sc.close();
    }
}
