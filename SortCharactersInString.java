package Interview_Questions;

import java.util.*;

public class SortCharactersInString {
    public static void M1(String s) {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        System.out.printf("After sorting the characters in the string : %s", Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to sort the characters alphabetically ....");
        String s = sc.nextLine();
        M1(s);
        sc.close();
    }
}
