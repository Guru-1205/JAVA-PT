package Interview_Questions.StriversStringPrograms.Easy;

public class RemoveOuterParthensis {

    public static void M1(String s) {
        int count = 0;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && count == 0) {
                count += 1;
            } else if (s.charAt(i) == '(' && count >= 1) {
                res += s.charAt(i);
                count += 1;
            } else if (s.charAt(i) == ')' && count > 1) {
                res += s.charAt(i);
                count -= 1;
            } else if (s.charAt(i) == ')' && count == 1) {
                count--;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        M1("(()())()");
    }
}
