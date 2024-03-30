package Interview_Questions.SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selection(int arr[]) {
        int n = arr.length;
        int min_idx;
        for (int i = 0; i < n; i++) {
            min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min_idx] > arr[j])
                    min_idx = j;
            }
            swap(arr, i, min_idx);
        }
    }

    public static void stableSelection(int arr[]) {
        int n = arr.length;
        int min_idx;
        for (int i = 0; i < n; i++) {
            min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min_idx] > arr[j])
                    min_idx = j;
            }
            if (min_idx != i)
                swap(arr, i, min_idx);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 90, 8, 23, 45, 6, 1 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
