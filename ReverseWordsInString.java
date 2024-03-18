package Interview_Questions;

import java.util.*;

public class ReverseWordsInString {

    public static String M1(String s) {
        String arr[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i != -1; i--) {
            sb.append(arr[i] + " ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse the words present in the string :");
        String s = sc.nextLine();
        System.out.printf("The String after reversing it's words : %s", M1(s));
        sc.close();
    }
}
