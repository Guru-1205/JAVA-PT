package Interview_Questions.SpecialNumberPrograms;

import java.util.Scanner;

public class NeonNumber {
    public static boolean M1(int x) {
        int sq = x * x, res = 0;
        while (sq > 0) {
            res += (sq % 10);
            sq /= 10;
        }
        return res == x ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a neon number or not :");
        int n = sc.nextInt();
        if (M1(n))
            System.out.println("Yes, it's an neon number");
        else
            System.out.println("Nope, not an neon number");
        sc.close();
    }
}
