package Interview_Questions;

import java.util.Arrays;

public class RotateArrayBy1 {
    // LEFT ROTATION
    public static void M1(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        System.out.printf("The Array after rotating one position to the left : %s", Arrays.toString(arr));
    }

    // RIGHT ROTATION
    public static void M2(int arr[]) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 2; i != -1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
        System.out.printf("The Array after rotating one position to the right : %s", Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        M2(arr);
    }
}
