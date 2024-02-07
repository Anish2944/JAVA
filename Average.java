import java.util.Scanner;

public class Average {
    public static float AverageNum(int a, int b, int c){
        float Avg;
        Avg = (a+b+c)/3;
        return Avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float result = AverageNum(a,b,c);
        System.out.println("Average of given three numbers are: "+result);
        sc.close();
    }
}