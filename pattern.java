public class pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        // for (int i = 0; i <= 5; i++) {  //Right-reverse triangle
        //     for (int j = i; j <= 5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // for (int i = 0; i <= 5; i++) {   //right triangle
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
    }
}
