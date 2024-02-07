import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String Name = sc.next();
        System.out.println("Hello " + Name + " nice to meet you");
        sc.close();
    }
}
