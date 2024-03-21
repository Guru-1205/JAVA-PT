package Interview_Questions.SpecialNumberPrograms;

import java.util.Scanner;

public class SpyNumber {
    public static boolean M1(int x) {
        int sum = 0, prod = 1;
        while (x > 0) {
            sum += (x % 10);
            prod *= (x % 10);
            x /= 10;
        }
        return (sum == prod) ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a spy number or not :");
        int n = sc.nextInt();
        if (M1(n))
            System.out.println("Yes, it's a spy number");
        else
            System.out.println("Nope, not a spy number");
        sc.close();
    }
}
