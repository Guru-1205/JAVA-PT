package Interview_Questions.SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int arr[], int l, int m, int h) {
        int n1 = m - l + 1, n2 = h - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int i = 0; i < n2; i++)
            R[i] = arr[m + 1 + i];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int h) {
        if (l < h) {
            int mid = l + (h - l) / 2;
            sort(arr, l, mid);
            sort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 98, 4, 3, 12, 100, 1 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
