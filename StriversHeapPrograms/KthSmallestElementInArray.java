package Interview_Questions.StriversHeapPrograms;

import java.util.PriorityQueue;

public class KthSmallestElementInArray {

    public static int M1(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int x : arr) {
            pq.add(x);
        }
        int res = -1;
        while (k != 0) {
            res = pq.poll();
            k--;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 12, 2, 7 };
        System.out.printf("%d", M1(arr, 3));
    }
}
