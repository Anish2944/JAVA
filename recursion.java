public class recursion {

    public static void occurrence(int[] arr, int key, int i){
        if (arr.length == i) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        occurrence(arr, key, i+1);
    }

    public static void WordNumber(int n){
        if (n==0) {
            return;
        }
        int fd = n%10;
        if (fd == 0) {
            System.out.print("zero ");
        }
        if (fd == 1) {
            System.out.print("one ");
        }
        if (fd == 2) {
            System.out.print("two ");
        }
        if (fd == 3) {
            System.out.print("three ");
        }
        if (fd == 4) {
            System.out.print("four ");
        }
        if (fd == 5) {
            System.out.print("five ");
        }
        if (fd == 6) {
            System.out.print("six ");
        }
        if (fd == 7) {
            System.out.print("seven ");
        }
        if (fd == 8) {
            System.out.print("eight ");
        }
        if (fd == 9) {
            System.out.print("nine ");
        }
         
        WordNumber(n/10);
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,2,7,2,2};
        occurrence(arr, 2, 0);
        WordNumber(1947);
    }
}
