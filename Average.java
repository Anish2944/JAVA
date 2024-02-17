import java.util.Scanner;

public class Average {
    public static double AverageNum(double a, double b, double c){
        double Avg;
        Avg = (a+b+c)/3;
        return Avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double result = AverageNum(a,b,c);
        System.out.println("Average of given three numbers are: "+result);
        sc.close();
    }
}