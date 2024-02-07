import java.util.Scanner;

public class SumOfAllOdd {
    public static int SumOdd(int n){
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            if (i%2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // int result = SumOdd(number);
        System.out.println(SumOdd(number));
        sc.close();
    }
}
