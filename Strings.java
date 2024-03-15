import java.util.*;

public class Strings {
    public static int LowVoweles(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                    count++;
                    continue;
                case 'e':
                    count++;
                    continue;
                case 'i':
                    count++;
                    continue;
                case 'o':
                    count++;
                    continue;
                case 'u':
                    count++;
                    continue;
                default:
                    continue;
            }
        }
        return count;
    }

    public static void anagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {
            char[] char1 = str1.toCharArray();
            char[] char2 = str2.toCharArray();
            Arrays.sort(char1);
            Arrays.sort(char2);
            if (Arrays.equals(char1, char2)) {
                System.out.println("Given strings are anagram to each other");
            } else {
                System.out.println("Not an angram");
            }
        } else {
            System.out.println("Not an angram");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Word");
        // String str = sc.next();
        // System.out.println(LowVoweles(str));
        anagrams("Race", "care");
        sc.close();

    }
}
