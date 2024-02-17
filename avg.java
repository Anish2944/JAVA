import java.util.*;

public class avg {
    public static void main(String[] args) {
        int a,b,c;
        float Average;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,b&c" );
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        Average= (a+b+c)/3;
        System.out.println("Your average is: "+Average);
       sc.close();
    }
}
