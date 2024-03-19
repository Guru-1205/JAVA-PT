package Interview_Questions;

public class MaximumDiffBetweenElementsInArray {
    public static void M1(int arr[]) {
        int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min < arr[i])
                min = arr[i];
            if (max > arr[i])
                max = arr[i];
        }
        System.out.printf("The maximum difference between the elements of the array : %d", Math.abs(max - min));
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 90, 80, 65, 4 };
        M1(arr);
    }
}
