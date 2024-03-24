import java.util.ArrayList;

public class arrlist {
    public static boolean monotonic(ArrayList<Integer> list) {
        if (list.get(0) < list.get(1)) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i+1)) {
                    return false;
                }
            }
        } else{
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) < list.get(i+1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(4);
        list.add(3);
        list.add(3);
        if (monotonic(list) == true) {
            System.out.println("monotonic");
        } else {
            System.out.println("not Monotonic");
        }
    }
}
