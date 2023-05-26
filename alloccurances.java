public class alloccurances {
    public static void occurances(int arr[], int i, int key) {
        if (i == arr.length) {
            return;
        }
        if (key == arr[i]) {
            System.out.print(i + " ");
        }
        occurances(arr, i + 1, key);
    }

    public static void main(String s[]) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        int i = 0;
        occurances(arr, i, key);
    }
}
