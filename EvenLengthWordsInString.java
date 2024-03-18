package Interview_Questions;

import java.util.Scanner;

public class EvenLengthWordsInString {
    public static void M1(String s) {
        String arr[] = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() % 2 == 0)
                System.out.printf("%s ", arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to print only even length words :");
        String s = sc.nextLine();
        M1(s);
        sc.close();
    }
}
