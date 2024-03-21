package Interview_Questions.SpecialNumberPrograms;

import java.util.*;

public class CircularPrimeAndCoPrime {

    public static boolean M1(int n) {
        String s = Integer.toString(n);
        int l = 0;
        while (s.length() != l) {
            s = s.substring(1) + s.charAt(0);
            if (!(isPrime(Integer.parseInt(s))))
                return false;
            l++;
        }
        return true;
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static boolean M2(int x1, int x2) { // Co-prime
        int x = Math.min(x1, x2);
        for (int i = 2; i <= x; i++) {
            if (x1 % i == 0 && x2 % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is an circular prime number ....");
        int n = sc.nextInt();
        if (M1(n))
            System.out.println("Yes ,it is an circular prime");
        else
            System.out.println("Nope ,not an circular prime");

        System.out.println("Enter two numbers to check whether they are co-prime ....");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        if (M2(x1, x2))
            System.out.println("Yes ,they are co-prime");
        else
            System.out.println("Nope ,not co-prime");
        sc.close();

    }
}
