package Interview_Questions.StriversStringPrograms.Medium;

public class LongestCharacterReplacement {

    public static void M1(String s, int k) {
        int count[] = new int[26];
        int result = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int i = 0, j = 0;
        while (i < s.length()) {
            count[s.charAt(i) - 'A']++;
            max = Math.max(max, count[s.charAt(i) - 'A']);
            if (i - j - max + 1 > k) {
                count[s.charAt(j) - 'A']--;
                j++;
            }
            result = Math.max(result, i - j + 1);
            i++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        M1("ABBA", 2);
    }
}
