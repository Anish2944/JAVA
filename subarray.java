public class subarray {
    public static void SubArray(int[] arr) {
        int crrsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end  = j;
                crrsum = 0;
                for (int k = start; k <= end; k++) {
                    // crrsum +=arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        SubArray(arr);
    }
}