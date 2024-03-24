package Interview_Questions.StriversStringPrograms.Easy;

public class IsomorphicString {
    public static boolean M1(String s, String t) {
        int map1[] = new int[256];
        int map2[] = new int[256];
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)])
                return false;
            map1[s.charAt(i)] += 1;
            map2[t.charAt(i)] += 1;
        }
        return true;
    }

    public static void main(String[] args) {
        if (M1("addfdda", "eggcggg"))
            System.out.println("Isomorphic string");
        else
            System.out.println("Not an Isomorphic string");
    }
}
