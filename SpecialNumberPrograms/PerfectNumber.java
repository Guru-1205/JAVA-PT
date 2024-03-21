package Interview_Questions.SpecialNumberPrograms;

import java.util.Scanner;

public class PerfectNumber {
    public static boolean M1(int x) {
        int temp = x, res = 0;
        for (int i = 1; i < temp; i++) {
            if (temp % i == 0)
                res += i;
        }
        return (res == x) ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a perfect number or not :");
        int n = sc.nextInt();
        if (M1(n))
            System.out.println("Yes, it's perfect number");
        else
            System.out.println("Nope, not a perfect number");
        sc.close();
    }
}
