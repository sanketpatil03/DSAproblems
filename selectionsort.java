public class selectionsort {
    public static void selectionsorting(int nums[]) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            int smaller = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[smaller] > nums[j]) {
                    smaller = j;
                }
            }
            temp = nums[smaller];
            nums[smaller] = nums[i];
            nums[i] = temp;

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String s[]) {
        int nums[] = { 5, 4, 3, 2, 1 };
        selectionsorting(nums);
    }
}
