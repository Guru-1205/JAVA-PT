package Interview_Questions;

import java.util.*;

public class RemoveElementFromArray {
    public static void M1(int arr[], int x) {
        for (int i = x - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = -1;
    }

    public static int[] M2(int arr[], int x) {
        int ans[] = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x - 1 == i)
                continue;
            ans[j] = arr[i];
            j += 1;
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Enter a specific position to delete from the array :");
        int n = sc.nextInt();
        M1(arr, n);
        M2(arr, n);
        System.out.printf("After removing the specific element from the array : %s", Arrays.toString(arr));
        sc.close();
    }
}
