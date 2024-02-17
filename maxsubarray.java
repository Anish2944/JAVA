// Kadane's Algorithm

import java.util.Scanner;

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
        System.out.println("Max SubArray Sum: " + ms);
    }

    public static void main(String args[]) {
        // int number[]= {-2,-3,4,-1,-2,1,5,-3};
        // int number[] = { -10, -20, -30, -40, -50 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] number = new int[size];
        System.out.println("Enter all elements");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        MSA(number);
        sc.close();
    }
}
