package Interview_Questions.StriversArrayPrograms.Easy;

public class MoveZeroesRight {
    public static int M1(int arr[]) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1)
            return -1;
        int temp = -1;
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 3, 0, 4 };
        int l = M1(arr);
        for (int i = 0; i < l; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
