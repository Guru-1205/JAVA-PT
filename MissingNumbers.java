package Interview_Questions;

import java.util.*;

public class MissingNumbers {
    public static void M1(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("The missing number : %d", (((arr.length + 1) * arr.length) / 2) - sum);
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
        sc.close();
    }
}
