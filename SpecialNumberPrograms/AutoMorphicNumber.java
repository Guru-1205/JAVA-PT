package Interview_Questions.SpecialNumberPrograms;

import java.util.Scanner;

public class AutoMorphicNumber {
    public static boolean M1(int n) {
        return (n * n) % 10 == n ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is an automorphic number ....");
        int n = sc.nextInt();
        if (M1(n))
            System.out.println("Yes ,it is an automorphic number");
        else
            System.out.println("Nope ,not an automorphic number");
        sc.close();
    }
}
