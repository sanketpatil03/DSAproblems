public class insertionsort {
    public static void insertionsorting(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int prev = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > prev) {
                nums[j + 1] = nums[j];
                j--;
            }
            j++;
            nums[j] = prev;

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void main(String s[]) {
        int nums[] = { 5, 4, 3, 2, 1 };
        insertionsorting(nums);
    }
}
