package Interview_Questions.StriversArrayPrograms.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class RearranageInAlternatingSign {
    // When the number of positive and negative signed elements are equal
    public static void M1(int arr[]) {
        int res[] = new int[arr.length];
        int pos = 0, neg = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                res[pos] = arr[i];
                pos += 2;
            } else {
                res[neg] = arr[i];
                neg += 2;
            }
        }
        System.out.println(Arrays.toString(res));
    }

    // when the number of positive and negative signed elements are not equal
    public static void M2(int arr[]) {
        ArrayList<Integer> p = new ArrayList<Integer>();
        ArrayList<Integer> n = new ArrayList<Integer>();
        for (int x : arr) {
            if (x > 0)
                p.add(x);
            else
                n.add(x);
        }
        int res[] = new int[arr.length];
        if (p.size() < n.size()) {
            int c = 0, i = 0;
            for (i = 0; p.size() != c; i += 2) {
                res[i] = p.get(c);
                res[i + 1] = n.get(c);
                c += 1;
            }
            for (int j = i; j < res.length; j++) {
                res[j] = n.get(c);
                c += 1;
            }
        } else {
            int c = 0, i = 0;
            for (i = 0; n.size() != c; i += 2) {
                res[i] = p.get(c);
                res[i + 1] = n.get(c);
                c += 1;
            }
            for (int j = i; j < res.length; j++) {
                res[j] = p.get(c);
                c += 1;
            }
        }
        System.out.println(Arrays.toString(res));

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -1, -2, 5, 6, 7 };
        M2(arr);
    }
}