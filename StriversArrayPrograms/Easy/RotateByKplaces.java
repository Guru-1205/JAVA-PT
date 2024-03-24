package Interview_Questions.StriversArrayPrograms.Easy;

import java.util.Arrays;

public class RotateByKplaces {

    public static void reverse(int arr[], int start, int end) {
        int temp;
        while (start <= end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void left(int arr[], int n, int k) {
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void right(int arr[], int n, int k) {
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        // left(arr, arr.length, 2);
        right(arr, arr.length, 2);
    }
}
