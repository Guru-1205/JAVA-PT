package Interview_Questions.StriversArrayPrograms.Easy;

import java.util.*;

public class FindNumberOccursOnceOthersTwice {
    public static int M1(int arr[]) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }

    public static int M2(int arr[]) {
        Map<Integer, Integer> hmp = new HashMap<Integer, Integer>();
        for (int x : arr) {
            hmp.put(x, hmp.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hmp.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 5, 4, 5, 3 };
        System.out.println(M2(arr));
    }
}
