package Interview_Questions.StriversStringPrograms.Medium;

public class MaxNestingDepthOfParenthesis {

    public static int M1(String s) {
        int count = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                count += 1;
            max = Math.max(count, max);
            if (s.charAt(i) == ')')
                count -= 1;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+(((8))/4))+1";
        System.out.println(M1(s));
    }
}
