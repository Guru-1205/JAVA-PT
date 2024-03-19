package Interview_Questions;

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

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 1 };
        M1(arr);
    }
}
