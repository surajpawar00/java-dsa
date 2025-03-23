import java.util.*;

class Solution2 {
    static String str;
    static ArrayList<String> list = new ArrayList<>();

    public static void func(int i, String res) {
        if (i == str.length()) {
            list.add(res);
            return;
        }

        if (i < str.length()) {
            if (str.charAt(i) == '0') return; // Ignore invalid case

            char ch = (char) ('a' + (str.charAt(i) - '1'));
            func(i + 1, res + ch); // Single digit case
        }

        if (i + 1 < str.length()) {
            int num = Integer.parseInt(str.substring(i, i + 2));
            if (num >= 1 && num <= 26) {
                char ch = (char) ('a' + (num - 1));
                func(i + 2, res + ch); // Two digit case
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        sc.close();
        
        func(0, "");
        Collections.sort(list); // Sorting to maintain lexicographic order
        
        for (String s : list) {
            System.out.println(s);
        }
    }
}
