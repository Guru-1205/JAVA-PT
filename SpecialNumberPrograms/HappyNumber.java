package Interview_Questions.SpecialNumberPrograms;

import java.util.Scanner;

public class HappyNumber {
    public static boolean M1(int x) {
        int temp = x, sum = 0;
        while (temp > 9) {
            while (temp > 0) {
                sum += (temp % 10);
                temp /= 10;
            }
            temp = sum;
            sum = 0;
        }
        if (temp == 1)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a happy number or not :");
        int n = sc.nextInt();
        if (M1(n))
            System.out.println("Yes, it's a happy number");
        else
            System.out.println("Nope, not a happy number");
        sc.close();
    }
}
