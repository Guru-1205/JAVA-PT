package Interview_Questions.StriversStringPrograms.Easy;

public class LongestCommonPrefix {

    public static String M1(String arr[]) {
        int min = arr[0].length();
        String s = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i].length()) {
                min = arr[i].length();
                s = arr[i];
            }
        }
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].charAt(i) != s.charAt(i))
                    return res;
            }
            res += s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String arr[] = { "flower", "flow", "flu" };
        System.out.println(M1(arr));
    }
}
