package Interview_Questions.StriversStringPrograms.Easy;

public class LargestOddInString {

    public static String M1(String s) {
        for (int i = s.length() - 1; i != -1; i--) {
            if (Character.getNumericValue(s.charAt(i)) % 2 == 1)
                return s.substring(0, i + 1);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(M1("8224")); // returns an empty string
        System.out.println(M1("9224")); // return 9
    }
}
