package Interview_Questions.StriversArrayPrograms.Easy;

import java.util.*;

public class MissingNumbers {
    public static void M1(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("The missing number : %d\n", (((arr.length + 1) * arr.length) / 2) - sum);
    }

    public static void M2(int arr[]) {
        int x1 = 0, x2 = 0;
        for (int i = 0; i < arr.length; i++) {
            x1 = x1 ^ arr[i];
            x2 = x2 ^ (i + 1);
        }
        x2 = x2 ^ (arr.length + 1);
        System.out.printf("The Missing number : %d", (x1 ^ x2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array to find the missing number :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        M1(arr);
        int arr2[] = { 1, 2, 4, 5 };
        M2(arr2);
        sc.close();
    }
}
