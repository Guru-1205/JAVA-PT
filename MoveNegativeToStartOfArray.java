package Interview_Questions;

import java.util.Arrays;

public class MoveNegativeToStartOfArray {
    // M1 method moves the negative numbers to the start of the array without
    // maintaining the order of +ve elements
    public static void M1(int arr[]) {
        int l = 0, r = arr.length - 1, temp = 0;
        while (l < r) {
            if (arr[l] < 0)
                l++;
            else if (arr[r] >= 0)
                r--;
            else {
                temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // M2 method moves the negative numbers to the start of the array with
    // maintaining the order of +ve elements
    public static void M2(int arr[]) {
        int res[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                res[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                res[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        int arr[] = { -1, -10, 3, 4, -6, -9 };
        M2(arr);
    }
}
