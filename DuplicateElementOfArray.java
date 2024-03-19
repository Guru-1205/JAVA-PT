package Interview_Questions;

import java.util.HashSet;

public class DuplicateElementOfArray {
    public static void M1(int arr[]) {
        HashSet<Integer> hs = new HashSet<Integer>();
        System.out.print("The repeating elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(arr[i]))
                System.out.printf("%d ", arr[i]);
            else
                hs.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 2, 8, 9, 5, 7, 8 };
        M1(arr);
    }
}
