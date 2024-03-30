package Interview_Questions.SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int arr[], int l, int r) {
        int i = l - 1;
        int pivot = arr[r];
        for (int j = l; j < r; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, r);
        return i + 1;
    }

    public static void quick(int arr[], int l, int r) {
        if (l < r) {
            int pi = partition(arr, l, r);
            quick(arr, l, pi - 1);
            quick(arr, pi + 1, r);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 90, 87, 6, 23, 5, 100, 1 };
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
