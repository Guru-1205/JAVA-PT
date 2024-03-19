package Interview_Questions;

import java.util.*;

public class FirstLastDigitOfNumber {
    public static void M1(int n) {
        int f = 0, l = 0;
        int temp = n;
        l = temp % 10;
        while (temp > 0) {
            f = temp % 10;
            temp /= 10;
        }
        System.out.printf("The sum of first and last digit of %d is %d ", n, (f + l));
    }

    public static void M2(int n) {
        String ns = Integer.toString(n);
        int f = Character.getNumericValue(ns.charAt(0));
        int l = Character.getNumericValue(ns.charAt(ns.length() - 1));
        System.out.printf("The sum of first and last digit of %d is %d ", n, (f + l));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of first and last digit :");
        int n = sc.nextInt();
        M2(n);
        sc.close();
    }
}
