package Interview_Questions;

import java.util.*;

public class SquareOfSortedArray {
    public static void M1(int arr[]) {
        int res[] = new int[arr.length];
        int i = 0, j = arr.length - 1, k;
        for (k = arr.length - 1; k != -1; k--) {
            if (Math.abs(arr[i]) < Math.abs(arr[j])) {
                res[k] = arr[j] * arr[j];
                j--;
            } else {
                res[k] = arr[i] * arr[i];
                i++;
            }
        }
        System.out.printf("The Sorted array after squaring the elements : %s", Arrays.toString(res));
    }

    public static void M2(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        System.out.printf("The Sorted array after squaring the elements : %s", Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of an array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        M2(arr);
        sc.close();

    }
}
