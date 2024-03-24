package Interview_Questions.StriversArrayPrograms.Medium;

// element whose right hand side are always smaller to it 
public class LeaderElementOfArray {
    public static void M1(int arr[]) {
        System.out.print("The leader elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.printf("%d ", arr[i]);
            }
        }
    }

    public static void M2(int arr[]) {
        int max = arr[arr.length - 1];
        System.out.print("The leader elements of the array : ");
        System.out.print(max + " ");
        for (int i = arr.length - 2; i != -1; i--) {
            if (arr[i] >= max) {
                System.out.print(arr[i] + " ");
                max = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 1 };
        M2(arr);
    }
}
