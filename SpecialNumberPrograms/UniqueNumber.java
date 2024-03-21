package Interview_Questions.SpecialNumberPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueNumber {

    public static boolean M1(int x) {
        HashSet<Integer> hs = new HashSet<Integer>();
        String s = Integer.toString(x);
        for (int i = 0; i < s.length(); i++) {
            if (!hs.contains(Character.getNumericValue(s.charAt(i))))
                hs.add(Character.getNumericValue(s.charAt(i)));
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is an unique number or not :");
        int n = sc.nextInt();
        if (M1(n))
            System.out.println("Yes, it's an unique number");
        else
            System.out.println("Nope, not an unique number");
        sc.close();
    }
}
