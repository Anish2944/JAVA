import java.util.ArrayList;

public class TargetKey {

    public static int key(ArrayList<Integer> list, int key){
        int target = list.get(list.indexOf(key)+1);
        int[] result = new int[109];
        ArrayList<Integer> fr = new ArrayList<>();
        for (int i = 0; i < list.size() -1; i++) {
            if (list.get(i)==key) {
                result[list.get(i+1)-1]++;
            }
        }
        return 0;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
    }
}
