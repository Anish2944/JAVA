// Kadane's Algorithm
public class maxsubarray {
    public static void MSA(int number[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            // cs += number[i];
            // if (cs < 0) {
            //     cs = 0;
            // }
            cs = Math.max(number[i], cs + number[i]);
            ms = Math.max(cs, ms);
        }
        System.out.println("Max number: " + ms);
    }

    public static void main(String args[]) {
        int number[]= {-2,-3,4,-1,-2,1,5,-3};
        // int number[] = { -10, -20, -30, -40, -50 };
        MSA(number);
    }
}
