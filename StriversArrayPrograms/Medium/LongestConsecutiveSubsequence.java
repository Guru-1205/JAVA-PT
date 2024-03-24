package Interview_Questions.StriversArrayPrograms.Medium;

import java.util.*;

public class LongestConsecutiveSubsequence {

    public static int M1(int arr[]) {
        Arrays.sort(arr);
        int maxseq = 1;
        int result = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] + 1 == arr[i]) {
                maxseq += 1;
            } else {
                result = Math.max(result, maxseq);
                maxseq = 1;
            }
        }
        return Math.max(maxseq, result);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 8, 6, 7, 9, 11, 13, 12, 15, 17, 16, 14, 1, 2, 4, 5 };
        System.out.println(M1(arr));
    }
}
