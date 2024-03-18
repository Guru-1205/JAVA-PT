package Interview_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElementOfArray {
    public static void M1(int arr[]) {
        Map<Integer, Integer> hmp = new HashMap<Integer, Integer>();
        for (int x : arr) {
            hmp.put(x, hmp.getOrDefault(x, 0) + 1);
        }
        int maxValue = 0, maxKey = 0;
        for (Map.Entry<Integer, Integer> entry : hmp.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.printf("The majority element present in the array : %d", maxKey);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array :");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array :");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        M1(arr);
        sc.close();
    }
}
