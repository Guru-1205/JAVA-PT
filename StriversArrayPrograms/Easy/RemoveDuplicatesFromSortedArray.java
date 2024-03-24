package Interview_Questions.StriversArrayPrograms.Easy;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static void M1(int arr[]) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        for (int x : arr) {
            hs.add(x);
        }
        int res[] = new int[hs.size()];
        int i = 0;
        for (int x : hs) {
            res[i] = x;
            i += 1;
        }
        System.out.printf("After removing the duplicates : %s", Arrays.toString(res));
    }

    public static void M2(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println("After removing the duplicates :");
        for (int k = 0; k < i + 1; k++) {
            System.out.printf("%d ", arr[k]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 3, 3, 4, 5, 5, 6 };
        M2(arr);
    }
}
