package Interview_Questions.SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void stableBubble(int arr[]) {
        int n = arr.length;
        boolean flag;
        for (int i = 0; i < n; i++) {
            flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    swap(arr, j, j + 1);
                }
            }
            if (flag == false)
                break;
        }
    }

    public static void bubble(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 13, 5, 77, 34, 20 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
