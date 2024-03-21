package Interview_Questions.SpecialNumberPrograms;

import java.util.*;

public class ArmstrongNumber {
    public static boolean M1(int n) {
        int d = (int) (Math.log10(n) + 1);
        int temp = n, res = 0;
        while (temp > 0) {
            res += (Math.pow(temp % 10, d));
            temp /= 10;
        }
        return res == n ? true : false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a armstrong number or not :");
        int n = sc.nextInt();
        if (M1(n))
            System.out.println("Yes, it's an armstrong number");
        else
            System.out.println("Nope, not an armstrong number");
        sc.close();

    }
}
