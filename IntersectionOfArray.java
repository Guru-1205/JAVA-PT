package Interview_Questions;

import java.util.*;

public class IntersectionOfArray {
    public static void M1(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<Integer>();
        System.out.print("The intersection of the two arrays : ");
        for (int x : arr1) {
            hs.add(x);
        }
        for (int x : arr2) {
            if (hs.contains(x))
                System.out.printf("%d ", x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of array 1 :");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements of the array 1 :");
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements of array 2 :");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements of the array 2 :");
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        M1(arr1, arr2);
        sc.close();
    }
}
