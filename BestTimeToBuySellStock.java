package Interview_Questions;

public class BestTimeToBuySellStock {
    public static void M1(int arr[]) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
            if ((arr[i] - min) > max)
                max = arr[i] - min;
        }
        System.out.printf("The maximum profit : %d", max);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 90, 75, 15, 60, 100, 13, 20 };
        M1(arr);
    }
}
