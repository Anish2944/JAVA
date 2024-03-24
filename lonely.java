import java.util.ArrayList;

public class lonely {

    public static ArrayList<Integer> lonelyfinder(ArrayList<Integer> list){
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> lonelyELement = new ArrayList<>();

        for (Integer repit : list) {
            if (!num.contains(repit)) {
                num.add(repit);
            } else{
                num.remove(repit);
            }
        }
        for (Integer i : num) {
            boolean found = false;
            for (Integer j : num) {
                if ((j == i -1) || (j == i + 1)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                lonelyELement.add(i);
            }
        }
    return num;
}
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
        for (Integer num : list) {
            System.out.println(num);
        }
        System.out.println(lonelyfinder(list));
    }
}
