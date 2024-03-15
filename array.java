import java.util.*;

public class array {

        public static int sockMerchant(int n, List<Integer> ar) {
            // Assuming the maximum number of different colors is 101 (0 to 100)
            int[] count = new int[101];

            // Count occurrences of each color
            for (int color : ar) {
                count[color]++;
            }

            System.out.println("Count array:");
            for (int i = 0; i < count.length; i++) {
                if (count[i] > 0) {
                    System.out.println("Color " + i + ": " + count[i] + " socks");
                }
            }

            int pairCount = 0;

            // Calculate pairs for each color
            for (int c : count) {
                pairCount += c / 2;
            }

            return pairCount;
        }

        public static void main(String[] args) {
            List<Integer> ar = Arrays.asList(1, 2, 1, 2, 1, 3, 2);
            int n = ar.size();
            int pairs = sockMerchant(n, ar);
            System.out.println("Number of pairs: " + pairs);
        }
    }
