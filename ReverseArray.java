package Interview_Questions;

import java.util.Arrays;

public class ReverseArray {
    public static void M1(int arr[]) {
        int l = 0, h = arr.length - 1, temp = 0;
        while (l < h) {
            temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
        System.out.printf("After reversing the array elements : %s", Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        M1(arr);
    }
}
