package Interview_Questions.StriversArrayPrograms.Easy;

import java.util.Arrays;

public class LargestAndSecondLargestNumber {
    public static void M1(int arr[]) {
        int max = arr[0], smax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                smax = max;
                max = arr[i];
            }
            if (smax < arr[i] && max > arr[i]) {
                smax = arr[i];
            }
        }
        System.out.printf("The largest and second largest element of the array - %s is %d and %d", Arrays.toString(arr),
                max, smax);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 5, 34, 9, 89, 100 };
        M1(arr);
    }
}
