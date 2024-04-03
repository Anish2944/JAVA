public class rotationArray {
    public static int[] Rotation(int[] arr,int d){
        int n = arr.length;
        while (d != 0) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;
            d--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr =new int[]{1,2,3,4,5};
        Rotation(arr, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
