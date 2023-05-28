public class bubblesorting {
    public static void bubblesort(int arr[]) {
        int size = arr.length;
        for (int turns = 0; turns < size - 1; turns++) {
            for (int j = 0; j < size - 1 - turns; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String s[]) {
        int arr[] = { 5, 4, 2, 3, 1 };
        bubblesort(arr);
        printarray(arr);

    }
}
