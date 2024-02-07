import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        int sum = 0;
        int i = 1;
        while (i <= n) {
            System.out.print(sum+"\t");
            sum = a + b;
            b = a;
            a = sum;
            i++;
        }
        sc.close();
    }
}
