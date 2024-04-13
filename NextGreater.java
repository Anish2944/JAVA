import java.util.Stack;
// IMPORTANT !!
public class NextGreater {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };

        Stack<Integer> st = new Stack<>();

        int nextGrt[] = new int[arr.length];

        for (int i = nextGrt.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nextGrt[i] = -1;
            } else {
                nextGrt[i] = arr[st.peek()];
            }
            st.push(i);
        }
        for (int j = 0; j < nextGrt.length; j++) {
            System.out.print(nextGrt[j] + " ");
        }
    }
}
