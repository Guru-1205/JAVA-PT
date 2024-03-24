package Interview_Questions.StriversHeapPrograms;

import java.util.*;

public class ReplaceElementsByItsRank {

    public static void M1(int arr[]) {
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        Arrays.sort(res);
        int temp = 1;
        HashMap<Integer, Integer> hmp = new HashMap<Integer, Integer>();
        for (int i = 0; i < res.length; i++) {
            if (hmp.get(res[i]) == null) {
                hmp.put(res[i], temp);
                temp++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", hmp.get(arr[i]));
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 15, 5, 75, 60 };
        M1(arr);
    }
}
