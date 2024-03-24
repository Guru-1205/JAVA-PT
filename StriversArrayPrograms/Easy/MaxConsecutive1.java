package Interview_Questions.StriversArrayPrograms.Easy;

public class MaxConsecutive1 {
    public static int M1(int arr[]) {
        int result = 0, maxlen = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                maxlen++;
            } else {
                result = Math.max(result, maxlen);
                maxlen = 0;
            }
        }
        return Math.max(result, maxlen);
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 0, 1, 1, 1, 0 };
        System.out.println(M1(arr));
    }
}
