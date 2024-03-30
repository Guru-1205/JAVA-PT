package Interview_Questions.SortingAlgorithms;

import java.util.Arrays;

public class HeapSort {

    public static void heap(int arr[], int n) {
        for (int i = n / 2 - 1; i != -1; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i != 0; i--) {
            int swap = arr[0];
            arr[0] = arr[i];
            arr[i] = swap;
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i) {
        int l = (2 * i) + 1, r = (2 * i) + 2;
        int largest = i;
        if (l < n && arr[largest] < arr[l])
            largest = l;
        if (r < n && arr[largest] < arr[r])
            largest = r;
        if (largest != i) {
            int swap = arr[largest];
            arr[largest] = arr[i];
            arr[i] = swap;
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 19, 6, 3, 33, 25 };
        heap(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
