import java.util.*;

class Solution4 {
    static String str;
    static ArrayList<String> list = new ArrayList<>();

    public static void func(int i, String res) {
        if (i == str.length()) {  // Base case: if index reaches the end, add result
            list.add(res);
            return;
        }
        if (i > str.length()) return;
        if (str.charAt(i) == '0') return;  // Skip invalid cases

        // Single digit conversion
        char ch = (char) ('a' + (str.charAt(i) - '1'));
        func(i + 1, res + ch);

        // Two digit conversion (checking valid range 10-26)
        if (i < str.length() - 1) {
            int a = str.charAt(i) - '0';
            int b = str.charAt(i + 1) - '0';
            int num = a * 10 + b;

            if (num >= 10 && num <= 26) {  // Ensuring valid character mapping
                ch = (char) ('a' + (num - 1));
                func(i + 2, res + ch);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        sc.close();

        String res = "";
        func(0, res);

        // Sorting lexicographically
        Collections.sort(list);

        // Printing output
        for (String s : list) {
            System.out.println(s);
        }
    }
}
