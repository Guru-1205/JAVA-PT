package Interview_Questions;

import java.util.*;

public class RotationOfEachWord {
    public static boolean M1(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if ((s1.substring(1) + s1.charAt(0)).equals(s2))
                return true;
            s1 = s1.substring(1) + s1.charAt(0);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s1 = sc.nextLine();
        System.out.println("Enter a string to check whether it's a rotation of the above mentioned word :");
        String s2 = sc.nextLine();
        if (M1(s1, s2))
            System.out.println("Yes,the given string is a rotation of word");
        else
            System.out.println("Nope, not a rotation of word");
        sc.close();
    }
}
