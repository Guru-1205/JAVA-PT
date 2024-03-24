package Interview_Questions.StriversArrayPrograms.Medium;

public class CountSubArrayEqualsK {
    public static void M1(int arr[], int k) {
        int l = 0, r = 0;
        int current = arr[0];
        int counter = 0;
        while (r != arr.length) {
            if (current < k) {
                r++;
                if (r == arr.length)
                    break;
                current += arr[r];
            } else if (current == k) {
                counter++;
                current -= arr[l];
                l++;
            } else {
                current -= arr[l];
                l++;
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2 };
        M1(arr, 3);
    }
}
