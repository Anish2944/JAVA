import java.util.Scanner;

public class power {
    public static int Power(int x, int n){
        int power = 1;
        for(int i=1; i<=n;i++){
            power = power*x;
        }
        return power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number then power");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Power of given input = "+Power(x, n));
        sc.close();
    }
}
