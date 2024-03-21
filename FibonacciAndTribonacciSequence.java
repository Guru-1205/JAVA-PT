package Interview_Questions;

import java.util.*;

public class FibonacciAndTribonacciSequence {
    // FIBONACCI SEQUENCE
    public static void M1(int n) {
        int n1 = 0, n2 = 1, temp;
        System.out.printf("%d %d ", n1, n2);
        for (int i = 2; i < n; i++) {
            temp = n1 + n2;
            System.out.printf("%d ", temp);
            n1 = n2;
            n2 = temp;
        }
        System.out.println();
    }

    // TRIBONACCI SEQUENCE
    public static void M2(int n) {
        int n1 = 0, n2 = 1, n3 = 1, temp;
        System.out.printf("%d %d %d ", n1, n2, n3);
        for (int i = 3; i < n; i++) {
            temp = n1 + n2 + n3;
            System.out.printf("%d ", temp);
            n1 = n2;
            n2 = n3;
            n3 = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for printing the sequence :");
        int n = sc.nextInt();
        M1(n);
        M2(n);
        sc.close();
    }
}
