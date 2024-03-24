package Interview_Questions.StriversStackAndQueuePrograms;

public class CountOfGreaterElementsToTheRight {

    public static int greaterElementsToRight(int arr[], int idx) {
        int counter = 0;
        for (int i = idx + 1; i < arr.length; i++) {
            if (arr[idx] < arr[i])
                counter++;
        }
        return counter;
    }

    public static void M1(int arr[], int q[]) {
        for (int i = 0; i < q.length; i++) {
            System.out.print(greaterElementsToRight(arr, q[i]) + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 5, 8, 9, 13, 4 };
        int q[] = { 0, 1, 5 };
        M1(arr, q);
    }
}
