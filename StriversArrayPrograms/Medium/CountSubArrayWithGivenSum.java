package Interview_Questions.StriversArrayPrograms.Medium;

public class CountSubArrayWithGivenSum {
    public static int M1(int arr[], int k) {
        int l = 0, r = 0, sum = arr[0], counter = 0;
        while (r < arr.length) {
            while (l <= r && sum > k) {
                sum -= arr[l];
                l++;
            }
            if (sum == k)
                counter++;
            r++;
            if (r < arr.length) {
                sum += arr[r];
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 3, 4, 6, 1 };
        System.out.println(M1(arr, 7));
    }
}
