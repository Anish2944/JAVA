public class countstr{
    public static long repeatedString(String s, long n) {
        // Write your code here
            long count = 0;
            StringBuilder sb = new StringBuilder(s);
            while (sb.length() < n) {
                sb.append(sb.toString());
            }
            int min = (int) Math.min(n, sb.length());
            String str = sb.substring(0,min);
            for (int i = 0; i < str.length()&& i<n; i++) {
                char ch = str.charAt(i);
                if (ch == 'a') {
                    count++;
                }
            }
            // long totalCount = 0;
            // long fullRepeats = n / s.length();
            // int remainingChars = (int) (n % s.length());

            // // Count 'a' occurrences in the original string
            // for (int i = 0; i < s.length(); i++) {
            //     if (s.charAt(i) == 'a') {
            //         totalCount += fullRepeats;
            //         if (i < remainingChars) {
            //             totalCount++;
            //         }
            //     }
            // }

            return count;
        }
    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
    }
}