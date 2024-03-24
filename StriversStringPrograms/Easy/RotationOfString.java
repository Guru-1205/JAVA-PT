package Interview_Questions.StriversStringPrograms.Easy;

public class RotationOfString {

    public static boolean M1(String target, String s) {
        if (target.length() != s.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (target.equals(s.substring(1) + s.charAt(0)))
                return true;
            s = s.substring(1) + s.charAt(0);
        }
        return false;
    }

    public static void main(String[] args) {
        if (M1("abcd", "dabc"))
            System.out.println("Yes,rotation of the word");
        else
            System.out.println("Nope ,not a rotation of the word");
    }
}
