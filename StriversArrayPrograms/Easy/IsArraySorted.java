package Interview_Questions.StriversArrayPrograms.Easy;

public class IsArraySorted {

    public static boolean M1(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 3, 1, 5 };
        if (M1(arr1))
            System.out.println("Array is in sorted order");
        else
            System.out.println("array is not in sorted order");
        if (M1(arr2))
            System.out.println("Array is in sorted order");
        else
            System.out.println("array is not in sorted order");
    }
}
