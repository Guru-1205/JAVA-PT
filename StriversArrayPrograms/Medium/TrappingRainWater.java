package Interview_Questions.StriversArrayPrograms.Medium;

public class TrappingRainWater {

    public static int M1(int arr[]) {
        int left = 0, right = arr.length - 1;
        int leftmax = 0, rightmax = 0;
        int res = 0;
        while (left <= right) {
            if (arr[right] >= arr[left]) {
                if (leftmax < arr[left]) {
                    leftmax = arr[left];
                } else {
                    res += leftmax - arr[left];
                }
                left++;
            } else {
                if (rightmax < arr[right]) {
                    rightmax = arr[right];
                } else {
                    res += rightmax - arr[right];
                }
                right--;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 5, 7, 3 };
        System.out.println(M1(arr));
    }
}
